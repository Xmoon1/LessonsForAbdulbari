package com.example.oop;

/**
 * <h1>Класс наследник Cat<h1/>
 * @see com.example.oop.Animals
 */
public class Cat extends Animals{
    @Override
    public void makeSound() {
        System.out.println("I can to say meow..");
    }
}
