package com.example.oop;

import com.example.Person;

public class Test {
    public static void main(String[] args) {

        Animals animals = new Animals();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animals.sleep();
        cat.sleep();
        dog.sleep();

        animals.makeSound();
        cat.makeSound();
        dog.makeSound();


        Person person = new Person("Alex", 32);
        System.out.println(person);
    }
}

