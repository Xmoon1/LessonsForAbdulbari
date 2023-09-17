package com.example;

public class Main {
   public static void main(String[] args) {
      Person person = new Person("John", 21);
      Dog dog = new Dog();

      System.out.println(dog.sleep());
      System.out.println(dog.makeSound());
   }
}

class Person{
   private String name;
   private int age;


   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   @Override
   public String toString() {
      return name + " " + age;
   }
}