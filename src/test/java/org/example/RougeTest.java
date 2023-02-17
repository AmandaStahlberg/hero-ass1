package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RougeTest {

    Hero rouge;
    @BeforeEach
    public void setUp() {
        rouge = new Rouge("RougeHero");
    }
    @Test
    public void checkName_shouldHaveCorrectName() {

        assertEquals("RougeHero", rouge.getName());
    }
    @Test
    public void checkLevel_shouldBe1() {

        assertEquals(1, rouge.getLevel());
    }
    @Test
    public void shouldHaveRightAttributes() {
        assertEquals(new Attributes(2,6,1), rouge.getAttributes());
    }

    @Test
    public void levelUp_shouldBeLevel2() {
        rouge.levelUp();
        assertEquals(2, rouge.getLevel());
    }

    @Test
    public void levelUp_shouldHaveHigherAttributes() {
        rouge.levelUp();
        assertEquals(new Attributes(3,10,2), rouge.getAttributes());
    }

    @Test
    public void displayHero_shouldBeCorrect() {
        String expected = """
                Details of Hero:\s
                Name: Rouge
                Class: Rouge
                Level: 1
                TotalStrength: 2
                TotalDexterity: 6
                TotalIntelligence: 1
                Damage: 1.0""";
        String actual = rouge.displayDetailsOfHero();

        assertEquals(expected, actual);
    }

}