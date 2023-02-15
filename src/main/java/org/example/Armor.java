package org.example;

public class Armor extends Item{
    private final ArmorType armorType;
    private final Attributes armorAttributes;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, Attributes armorAttributes) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttributes = armorAttributes;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public Attributes getArmorAttributes() {
        return armorAttributes;
    }
}
