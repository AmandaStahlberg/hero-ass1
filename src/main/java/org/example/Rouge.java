package org.example;

public class Rouge extends Hero{
    public Rouge(String name) {
        super(name, "Rouge", new Attributes(2,6,1));
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.addAttributes(1,4,1);
        addValidWeaponType(WeaponType.DAGGER);
        addValidWeaponType(WeaponType.SWORD);

        addValidArmorType(ArmorType.LEATHER);
        addValidArmorType(ArmorType.MAIL);
    }
}
