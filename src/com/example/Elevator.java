package com.example;

public class Elevator {
   private int floor;

   private int minFloor;
   private int maxFloor;


   public Elevator(int minFloor, int maxFloor) {
      if (minFloor<= maxFloor){
         this.floor=minFloor;
         this.minFloor = minFloor;
         this.maxFloor = maxFloor;
      }else System.out.println("The min floor cannot be more than the max floor");



   }

   public Elevator(int maxFloor) {
      this.floor=1;
      this.minFloor = 1;
      this.maxFloor = maxFloor;
   }

   public void move(int floor){
      if (floor > this.maxFloor || floor < this.minFloor){
         System.out.println("The elevator can only move along the specified range");
      }else this.floor = floor;
   }


   @Override
   public String toString() {
      return "["+this.minFloor + ", "+this.maxFloor + "]" + "->" + this.floor;
   }
}
