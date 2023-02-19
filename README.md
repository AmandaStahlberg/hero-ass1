# hero-ass1
Assignment in JAVA course for Noroff.

## Introduction and Overview
This assignment requires you to create classes and methods for an Action RPG game. Specifically, you need to implement a hero select screen with the following features:

* Four classes of heroes: Mage, Ranger, Rogue, and Warrior.
* Each hero has a name, level, level attributes, equipment, valid weapon types, and valid armor types.
* Public facing methods include constructor, level up, equip, damage, total attributes, and display.
* Hero attributes are Strength, Dexterity, and Intelligence, and each hero subclass has different attribute gains.
* Heroes can equip weapons and armor, and each has a required level and slot.
* Weapon types include Axe, Bow, Dagger, Hammer, Staff, Sword, and Wand.
* Armor types include Cloth, Leather, Mail, and Plate.

The assignment also includes detailed instructions for each aspect of the hero select screen. Please see below for a more comprehensive breakdown of each requirement.

## Hero Attributes
The first requirement of this assignment is to create a `Attribute` class to encapsulate the Strength, Dexterity, and Intelligence attributes of each hero. This class should have methods to add two instances together and return the sum, or increase the one instance by a specified amount.

## Levelling Attributes
The next requirement is to create an abstract `Hero` class to encapsulate all shared functionality. Each subclass (Mage, Ranger, Rogue, Warrior) will start at different attributes and increase at different rates when levelling up. The instructions provide specific details for each subclass.

## Items and Equipment
The final requirement of this assignment is to create an abstract `Item` class for weapons and armor, with subclasses for each type of item. Each item has a name, required level, and slot. Weapons have a weapon type and damage, while armor has an armor type and an attribute bonus.

Heroes can equip various items, with four different slots: Weapon, Head, Body, and Legs. When a new hero is created, their equipment is initialized to have each slot as an entry with null values to represent empty slots. Each subclass can only equip certain weapon types, and if a hero tries to equip an item they should not be able to because of the wrong type or a level requirement that they don't meet.

## Conclusion
This README provides a brief overview of the requirements for the Hero Assignment.
