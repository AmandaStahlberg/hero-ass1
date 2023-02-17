package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {
    Armor armor;

    @BeforeEach
    public void setUp() {
        armor = new Armor("Armor", 1, Slot.HEAD, ArmorType.PLATE, new Attributes(1,2,3));
    }

    @Test
    public void checkName_shouldHaveCorrectName(){
        assertEquals("Armor", armor.getName());
    }

    @Test
    public void checkLevel_shouldBe1() {
        assertEquals(1, armor.getRequiredLevel());
    }

    @Test
    public void checkSlot_shouldBeHead() {
        assertEquals(Slot.HEAD, armor.getSlot());
    }

    @Test
    public void checkType_shouldBePlate() {
        assertEquals(ArmorType.PLATE, armor.getArmorType());
    }

    @Test
    public void shouldHaveRightAttributes() {
        assertEquals(new Attributes(1,2,3), armor.getArmorAttributes());
    }

}