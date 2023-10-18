package com.example;

public class Cat implements Animal{

   @Override
   public void makeSound() {
      System.out.println("Meow...");
   }

   @Override
   public void sleep() {
      System.out.println("I can to sleep..");
   }
}
