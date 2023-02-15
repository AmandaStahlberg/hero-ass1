package org.example;

public class Attributes {
    private int strength;
    private int dexterity;
    private int intelligence;

    public Attributes(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void addAttributes(Attributes newAttributes) {
        setStrength(this.strength + newAttributes.getStrength());
        setDexterity(this.dexterity + newAttributes.getDexterity());
        setIntelligence(this.intelligence + newAttributes.getIntelligence());
    }

    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void setStrength( int strength) {
        this.strength = strength;
    }

    public void setDexterity( int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence( int intelligence) {
        this.intelligence = intelligence;
    }
}
