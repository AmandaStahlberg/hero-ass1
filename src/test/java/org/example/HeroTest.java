package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    Hero mage;

    @BeforeEach
    public void setUp() {
        mage = new Mage("Mage");
    }

    // FIX ERROR ON LEVEL AND TYPE

    @Test
    public void equipWeapon_shouldHaveRightType() {
        Weapon wand = new Weapon("Wanda", 1, WeaponType.WAND, 2);
        mage.equipWeapon(wand);
        assertEquals(mage.getWeapon().getWeaponType(), WeaponType.WAND);
    }


    @Test
    public void equipArmor_shouldHaveRightType() {
        Armor armor = new Armor("Cloth", 1, Slot.BODY, ArmorType.CLOTH, new Attributes(1,2,3));
        mage.equipArmor(armor);
        assertEquals(mage.getArmor(Slot.BODY).getArmorType(), ArmorType.CLOTH);
    }
}