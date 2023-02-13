package org.example;

import java.util.ArrayList;

public abstract class Hero {
    private String heroClass;
    private String name;
    private int level = 1;

    private int levelAttributes;
    private String equipment;
    // private ArrayList<WeaponType> weapons = new ArrayList<WeaponType>();
    // private ArrayList<ArmorType> armors = new ArrayList<ArmorType>();

    Hero(String name, String heroClass) {
        this.heroClass = heroClass;
        this.name = name;
        this.level = level;
        this.levelAttributes = levelAttributes;
        this.equipment = equipment;
    }

    public void levelUp() {
        level++;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }
    public String toString() {
        return String.format("name of hero:  %s \n hero of class: %s ", this.name, this.heroClass);
    }
}
