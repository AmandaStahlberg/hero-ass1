package org.example;

public class Main {
    public static void main(String[] args) {

        Hero mage = new Mage("Mage");
        mage.displayDetailsOfHero();
        mage.levelUp();
        System.out.println(mage.getDamagingAttribute(mage.getAttributes()));
        mage.levelUp();
        Weapon wand = new Weapon("NAME", 1, WeaponType.WAND, 10 );
        Armor test = new Armor("testArmor", 2,  Slot.BODY ,ArmorType.CLOTH, new Attributes(1,1,5));
        mage.equipWeapon(wand);
        mage.equipArmor(test);
        mage.displayDetailsOfHero();
        Weapon wand2 = new Weapon("NAME", 1, WeaponType.STAFF, 10 );
        mage.equipWeapon(wand2);
        System.out.println(mage.displayDetailsOfHero());

    }
}