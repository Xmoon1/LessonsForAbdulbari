package com.example;
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 17);
        Person person2 = new Person("John", 21);
        Person person3 = new Person("Bob", 25);
        Person person4 = new Person();
       

        person1.showInfo();
        person2.showInfo();
        person3.showInfo();
        
        // System.out.println(person1.name);

       
        // System.out.println(person1.showInfoAsString("Tim"));
        // System.out.println(person1.getBirthYear());
        // System.out.println(person2.getBirthYear());
        // System.out.println(person3.getBirthYear());


//        System.out.println("My name is " + person1.name + ", age: " + person1.age );
//        System.out.println("My name is " + person2.name + ", age: " + person2.age);
//        System.out.println("My name is " + person3.name + ", age: " + person3.age);
    }
}

