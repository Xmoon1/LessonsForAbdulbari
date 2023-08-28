package com.example;

import java.util.Scanner;

/**
 * <h1>Switch - Case</h1>
 */

@SuppressWarnings("all")
public class SwitchCase {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int monthNumber = input.nextInt();


        /*
                switch (переменная или выражение для сравнения) {
                    case Совпадение1:
                        код программы;
                        break;
                    case Совпадение 2:
                        код программы;
                        break;
                    case Совпадение 3:
                        код программы;
                        break;
                    default:  // поведение во всех остальных случаях
                        код программы;
                        break;
}
         */

//        switch (monthNumber){
//            case 1, 2, 12:
//                System.out.println("Winter");
//                break;
//            case 3, 4, 5:
//                System.out.println("Spring");
//                break;
//            case 6, 7, 8:
//                System.out.println("Summer");
//                break;
//            case 9, 10, 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("ERROR");
//        }

//        if (monthNumber == 1 || monthNumber==2 || monthNumber == 12){
//            System.out.println("Winter");
//        }else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
//            System.out.println("Spring");
//        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
//            System.out.println("Summer");
//        }else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
//            System.out.println("Autumn");
//        }else {
//            System.out.println("ERROR");
//        }

        int test = 1;
        while (test<=20){
            test++;

            if (!(test%2==0)){
                continue;
            }

            System.out.println(test);
        }

    }
}
