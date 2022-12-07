package it.develhope.polymorphism;

public class Animal {

    public String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println(animalName + " has a default animal sound.");
    }

}
