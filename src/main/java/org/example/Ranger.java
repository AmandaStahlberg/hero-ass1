package org.example;

public class Ranger extends Hero{
    public Ranger(String name) {
        super(name, "Ranger", new Attributes(1,7,1));
        addValidWeaponType(WeaponType.BOW);

        addValidArmorType(ArmorType.LEATHER);
        addValidArmorType(ArmorType.MAIL);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.addAttributes(1,5,1);

    }

    @Override
    protected int getDamagingAttribute(Attributes totalAttributes) {
        return totalAttributes.getIntelligence();
    }


}
