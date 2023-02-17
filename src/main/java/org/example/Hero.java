package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import org.example.WeaponType;
import org.example.ArmorType;
import org.example.Slot;

public abstract class Hero {
    private String typeOfHero;
    private String name;
    private int level = 1;

    private Attributes levelAttributes;
    private ArrayList<WeaponType> validWeaponTypes;
    private ArrayList<ArmorType> validArmorTypes;
    private HashMap<Slot, Item> equipment;


    public Hero(String name, String heroClass, Attributes attributes) {
        this.typeOfHero = heroClass;
        this.name = name;
        this.levelAttributes = attributes;

        equipment = new HashMap<>();
        equipment.put(Slot.WEAPON, null);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);

        validWeaponTypes = new ArrayList<WeaponType>();
        validArmorTypes = new ArrayList<ArmorType>();

    }

    public void levelUp() {
        level++;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void addAttributes(int strength, int dexterity, int intelligence) {
        levelAttributes.addAttributes(new Attributes(strength, dexterity, intelligence));
    }

    public Attributes getLevelAttributes() {
        return this.levelAttributes;
    }

    public Attributes getAttributes(){
        Attributes attribute = new Attributes(levelAttributes.getStrength(),
                levelAttributes.getDexterity(),levelAttributes.getIntelligence());
        for (Slot slot : Slot.values()) {
            if(!slot.equals(Slot.WEAPON)){
                if(getArmor(slot) != null) {
                    attribute.addAttributes(new Attributes(
                            getArmor(slot).getArmorAttributes().getStrength(),
                            getArmor(slot).getArmorAttributes().getDexterity(),
                            getArmor(slot).getArmorAttributes().getIntelligence()));
                }
            }}

        return attribute;
    }

    public void addValidWeaponType(WeaponType weaponType){
        this.validWeaponTypes.add(weaponType);
    }

    public void addValidArmorType(ArmorType armorType){
        this.validArmorTypes.add(armorType);
    }
    public Weapon getWeapon() {
        return (Weapon) equipment.get(Slot.WEAPON);
    }

    public Armor getArmor(Slot slot) {
        return (Armor) equipment.get(slot);
    }

    public void equipWeapon(Weapon weapon) {
        try {
            if(!validWeaponTypes.contains(weapon.getWeaponType())) {
                throw new InvalidWeaponException("Wrong weapon type.");
            }
            if(weapon.getRequiredLevel() > level) {
                throw new InvalidWeaponException("Level on weapon is too high.");
            }
        } catch (InvalidWeaponException e) {
            throw new RuntimeException(e);
        }
        equipment.put(weapon.getSlot(), weapon);
    }

    public void equipArmor(Armor armor) {
       try {
           if(!validArmorTypes.contains(armor.getArmorType())) {
               throw new InvalidArmorException("Wrong armor type.");
           }
           if(armor.getRequiredLevel() > level) {
               throw new InvalidArmorException("Level on armor is too high.");
           }
       }  catch (InvalidArmorException e) {
           throw new RuntimeException(e);
       }
           equipment.put(armor.getSlot(), armor);
    }
    public double getDamage() {
        double weaponDamage = 1;
        if(getWeapon() != null) {
            weaponDamage = ((Weapon)equipment.get(Slot.WEAPON)).getWeaponDamage();
            return weaponDamage * (1 + (getDamagingAttribute(getAttributes())/100d));
        } return weaponDamage;
    }

    protected abstract int getDamagingAttribute(Attributes totalAttributes);
    public String printLevelAttributes() {
        return String.format("Strength: %s \nDexterity: %s \nIntelligence: %s", this.levelAttributes.getStrength(), this.levelAttributes.getDexterity(), this.levelAttributes.getIntelligence() );
    }
    public void displayDetailsOfHero(){
        System.out.printf("Hero of type: %s \nName: %s \nLevel: %s \n%s \nDamage: %s\n Picked Weapon: %s\n", this.typeOfHero, this.name, this.level, this.printLevelAttributes(), this.getDamage(), this.getWeapon());
    }


}
