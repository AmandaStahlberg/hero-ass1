package org.example;

public class Ranger extends Hero{
    public Ranger(String name) {
        super(name, "Ranger", new Attributes(1,7,1));
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.addAttributes(1,5,1);
        addValidWeaponType(WeaponType.BOW);
    }
}
