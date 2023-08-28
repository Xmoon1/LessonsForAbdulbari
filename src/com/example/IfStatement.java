package com.example;

import java.util.Scanner;

/**
 * @author John Connor
 * <h1>IF Statement</h1>
 */

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
               if(<условие1>){
                    <тело>
               }else if(<условие2>){
               <тело2>
              }else if(<условие3>){
               <тело3>
               }else if(<условие4>){
               <тело4>
               }else{
                }
         */
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a < b){
//            System.out.println("True");
//        }else if (a==b){
//            System.out.println("Maybe true");
//        }
//        else {
//            System.out.println("False");
//        }

        /* Логические операции:
              && - И
              || - ИЛИ
              ! - НЕ
         */


        int monthNumber = scanner.nextInt();
        if (monthNumber == 1 || monthNumber==2 || monthNumber == 12){
            System.out.println("Winter");
        }else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        }else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        }else {
            System.out.println("ERROR");
        }

    }
}
