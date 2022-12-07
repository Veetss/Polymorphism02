package it.develhope.polymorphism;

import it.develhope.polymorphism.entities.Cow;
import it.develhope.polymorphism.entities.Lion;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Basso il tasso");
        Lion lion = new Lion("Riccardo il leone codardo");
        Cow cow = new Cow("Fiorella la mucca bella");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();

    }
}