package it.develhope.polymorphism.entities;

import it.develhope.polymorphism.Animal;

public class Cow extends Animal {
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println(animalName + " go muuuuuu!");
    }
}
