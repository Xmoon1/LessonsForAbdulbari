package com.example;

public class Main {
   public static void main(String[] args) {
      Elevator elevator = new Elevator(1, 10);
      elevator.move(3);

      System.out.println(elevator);
   }
}