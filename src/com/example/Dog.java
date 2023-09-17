package com.example;

public class Dog extends Animals implements Info {
   @Override
   public String sleep() {
      return "Dog can to sleep..";
   }


   @Override
   public String makeSound() {
      return "I can to bark..";
   }

//   @Override  // Аннотация
//   public void sleep() {
//      System.out.println("Dog can to sleep..");
//   }
}
