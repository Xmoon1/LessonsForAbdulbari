package com.example;

public class Arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[5];  // 5 - длина массива
//        //  0   1   2   3   4
//        // [0] [0] [0] [0] [0]
//        numbers[2] = 12;
//        numbers[0] = 93;
//        numbers[4] = 10;

        int[] numbers = {1, 2, 4, 5};

        for (int number: numbers) {
            System.out.println(number);
        }

//        System.out.println(numbers.length);


//        System.out.println(numbers.length);

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int[][] numbers2 = {{1, 2, 3},
                            {4, 5, 6, 7},
                            {8, 9}};
        // {{1, 2, 3},
        // {5, 6, 7, 8},
        // {9, 10}}

//        System.out.println(numbers2[1][3]);

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.printf("%d ",numbers2[i][j]);
            }
            System.out.println();
        }

    }
}
