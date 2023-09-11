package com.example;

// Modifiers: default, public, protected, private
public class Person {
    /*
    1. Поля - данные
    2. Методы - действия
     */

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){}

    public void showInfo() {
//        System.out.println("My name is " + name + ", age: " + age);
        System.out.printf("My name is %s, age: %d", name, age);
        System.out.println();
    }

    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public String showInfoAsString(String name) {
//        System.out.println("My name is " + name + ", age: " + age);
//        System.out.printf("My name is %s, age: %d", name, age);
//        System.out.println();
        this.name = name;
        return "My name is " + name + ", age: " + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getBirthYear(){
        return 2023-age;
    }


}
