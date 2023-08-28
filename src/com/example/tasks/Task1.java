package com.example.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenOrOdd = scanner.nextInt();

        if (evenOrOdd % 2 == 0){
            System.out.println("Even");
        }else System.out.println("Odd");

    }
}
