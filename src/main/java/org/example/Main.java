package org.example;

public class Main {
    public static void main(String[] args) {

        Hero mage = new Mage("Hero Mage");
        mage.displayDetailsOfHero();
        mage.levelUp();
        System.out.println(mage.getDamagingAttribute(mage.getAttributes()));
        mage.levelUp();
        Weapon wand = new Weapon("NAME", 1, WeaponType.WAND, 10 );
        Armor test = new Armor("testArmor", 2,  Slot.BODY ,ArmorType.CLOTH, new Attributes(1,1,5));
        mage.equipWeapon(wand);
        mage.equipArmor(test);
        mage.displayDetailsOfHero();

    }
}