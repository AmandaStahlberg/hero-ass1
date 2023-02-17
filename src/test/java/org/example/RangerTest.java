package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    Hero ranger;
    @BeforeEach
    public void setUp() {
        ranger = new Ranger("RangerHero");
    }
    @Test
    public void checkName_shouldHaveCorrectName() {
        assertEquals("RangerHero", ranger.getName());
    }
    @Test
    public void checkLevel_shouldBe1() {
        assertEquals(1, ranger.getLevel());
    }
    @Test
    public void shouldHaveRightAttributes() {
        assertEquals(new Attributes(1,7,1), ranger.getAttributes());
    }

    @Test
    public void levelUp_shouldBeLevel2() {
        ranger.levelUp();
        assertEquals(2, ranger.getLevel());
    }

    @Test
    public void levelUp_shouldHaveHigherAttributes() {
        ranger.levelUp();
        assertEquals(new Attributes(2,14,2), ranger.getAttributes());
    }

    @Test
    public void displayHero_shouldBeCorrect() {
        String expected = """
                Details of Hero:\s
                Name: Ranger
                Class: Ranger
                Level: 1
                TotalStrength: 1
                TotalDexterity: 7
                TotalIntelligence: 1
                Damage: 1.0""";
        String actual = ranger.displayDetailsOfHero();

        assertEquals(expected, actual);
    }
}