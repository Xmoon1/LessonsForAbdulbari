package com.example.oop;

/**
 * <h1>Класс наследник Dog<h1/>
 * @see com.example.oop.Animals
 */
public class Dog extends Animals{
    @Override
    public void makeSound() {
        System.out.println("I can to bark..");
    }
}
