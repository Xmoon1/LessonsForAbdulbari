import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String a = "Hello";
//
//        String b = " world!";


        // toLowerCase() - строка в нижний регистр
        // toUpperCaseCase() - строка в верхний регистр
//
//        System.out.println(a.toLowerCase());
//        System.out.println(a.toUpperCase());
//        System.out.println(a.isEmpty());
//        System.out.println(a.equals(b));


        // Арефметические операции: + - * / %

//        double number = 20/3f;
//
//        System.out.println(20+3);
//        System.out.println(20-3);
//        System.out.println(20*3);
//        System.out.println(number);
//
//
//        String c = a + b;
//        System.out.println(c);

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(a+b+c);
        System.out.println(a*b*c);
        System.out.println((a+b+c)/3f);

    }

}