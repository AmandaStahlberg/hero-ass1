package org.example;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, "Warrior", new Attributes(5,2,1));
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.addAttributes(3,2,1);
        addValidWeaponType(WeaponType.AXE);
        addValidWeaponType(WeaponType.HAMMER);
        addValidWeaponType(WeaponType.SWORD);

        addValidArmorType(ArmorType.MAIL);
        addValidArmorType(ArmorType.PLATE);
    }
}
