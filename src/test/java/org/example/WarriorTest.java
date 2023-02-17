package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Hero warrior;
    @BeforeEach
    public void setUp() {
        warrior = new Warrior("WarriorHero");
    }
    @Test
    public void checkName_shouldHaveCorrectName() {
        assertEquals("WarriorHero", warrior.getName());
    }
    @Test
    public void checkLevel_shouldBe1() {
        assertEquals(1, warrior.getLevel());
    }
    @Test
    public void shouldHaveRightAttributes() {
        assertEquals(new Attributes(5,2,1), warrior.getAttributes());
    }

    @Test
    public void levelUp_shouldBeLevel2() {
        warrior.levelUp();
        assertEquals(2, warrior.getLevel());
    }

    @Test
    public void levelUp_shouldHaveHigherAttributes() {
        warrior.levelUp();
        assertEquals(new Attributes(8,4,2), warrior.getAttributes());
    }

    @Test
    public void displayHero_shouldBeCorrect() {
        String expected = """
                Details of Hero:\s
                Name: Warrior
                Class: Warrior
                Level: 1
                TotalStrength: 1
                TotalDexterity: 1
                TotalIntelligence: 8
                Damage: 1.0""";
        String actual = warrior.displayDetailsOfHero();

        assertEquals(expected, actual);
    }

}