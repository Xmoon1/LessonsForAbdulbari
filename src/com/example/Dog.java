package com.example;

public class Dog implements Animal{
   @Override
   public void makeSound() {
      System.out.println("I can to bark..");
   }

   @Override
   public void sleep() {
      System.out.println("I can to sleep..");
   }

   public void play(){
      System.out.println("I can to play");
   }
}
