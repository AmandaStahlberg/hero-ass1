package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon weapon;

    @BeforeEach
    public void setUp() {
        weapon = new Weapon("AXE", 1, WeaponType.AXE, 1);
    }

    @Test
    public void checkName_shouldHaveCorrectName(){
       assertEquals("AXE", weapon.getName());
    }

    @Test
    public void checkLevel_shouldBe1() {
        assertEquals(1, weapon.getRequiredLevel());
    }

    @Test
    public void checkSlot_shouldBeWeapon() {
        assertEquals(Slot.WEAPON, weapon.getSlot());
    }

    @Test
    public void checkType_shouldBeAxe() {
        assertEquals(WeaponType.AXE, weapon.getWeaponType());
    }

    @Test
    public void checkWeaponDamage_shouldBe1() {
        assertEquals(1, weapon.getWeaponDamage());
    }

}