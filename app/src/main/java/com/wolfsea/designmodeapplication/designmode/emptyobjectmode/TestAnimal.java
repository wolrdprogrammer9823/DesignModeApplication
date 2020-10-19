package com.wolfsea.designmodeapplication.designmode.emptyobjectmode;

public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new NullAnimal();
        hear(animal);

        System.out.println("============================");

        animal = new Dog();
        hear(animal);

        System.out.println("============================");

        animal = new Duck();
        hear(animal);

    }

    public static void hear(Animal animal) {
       
        animal.makeSound();
    }
}
