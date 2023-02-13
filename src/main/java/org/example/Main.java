package org.example;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Warrior("Hero Warrior");
        System.out.println(hero.toString());

        Hero mage = new Mage("Hero Mage");
        System.out.println(mage.toString());

        Hero ranger = new Ranger("Hero Ranger");
        System.out.println(ranger.toString());

        Hero rouge = new Rouge("Hero Rouge");
        System.out.println(rouge.toString());

    }
}