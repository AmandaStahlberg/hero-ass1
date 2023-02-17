package org.example;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, "Mage", new Attributes(1,1,8));
        addValidWeaponType(WeaponType.WAND);
        addValidWeaponType(WeaponType.STAFF);

        addValidArmorType(ArmorType.CLOTH);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.addAttributes(1,1,5);
    }

    @Override
    protected int getDamagingAttribute(Attributes totalAttributes) {
        return totalAttributes.getIntelligence();
    }

}
