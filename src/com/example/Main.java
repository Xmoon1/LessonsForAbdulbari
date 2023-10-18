package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Dog dog = new Dog();
      Cat cat = new Cat();

      test(dog);
      test(cat);
   }

   public static void test(Animal animal){
      animal.makeSound();
      animal.sleep();
   }
}
