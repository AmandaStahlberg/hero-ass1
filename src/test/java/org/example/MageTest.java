package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Hero mage;
    @BeforeEach
    public void setUp() {
        mage = new Mage("Mage");
    }
    @Test
    public void checkName_shouldHaveCorrectName() {
        assertEquals("Mage", mage.getName());
    }
    @Test
    public void checkLevel_shouldBe1() {
        assertEquals(1, mage.getLevel());
    }
    @Test
    public void shouldHaveRightAttributes() {
        assertEquals(new Attributes(1,1,8), mage.getAttributes());
    }

    @Test
    public void levelUp_shouldBeLevel2() {
        mage.levelUp();
        assertEquals(2, mage.getLevel());
    }

    @Test
    public void levelUp_shouldHaveHigherAttributes() {
        mage.levelUp();
        assertEquals(new Attributes(2,2,13), mage.getAttributes());
    }

    @Test
    public void displayHero_shouldBeCorrect() {
        String expected = """
                Details of Hero:\s
                Name: Mage
                Class: Mage
                Level: 1
                TotalStrength: 1
                TotalDexterity: 1
                TotalIntelligence: 8
                Damage: 1.0""";
        String actual = mage.displayDetailsOfHero();

        assertEquals(expected, actual);
    }
}