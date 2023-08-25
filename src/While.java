import java.util.Scanner;


/**
 * @author John Connor
 * <h1>WHILE loop</h1>
 */
public class While {
    public static void main(String[] args) {
//        int number = 0;

        // while (<условие>){  пока
            // <тело>
    //}


//        while (number < 10){
//            System.out.println(number);
//            number++;  // number += 1; number = number + 1;
//        }
//
//        System.out.println("//////////////////////////");

//        do {
//            number++;  // number += 1; number = number + 1;
//            System.out.println(number);
//        }while (number<10);


        // Task1

        Scanner input = new Scanner(System.in);  // Camel case
        int number = input.nextInt();

        int sqrt = 1;
//        while (sqrt*sqrt < number){
//            System.out.println(sqrt*sqrt);
//            sqrt++;
//        }

//        do {
//            System.out.println(sqrt*sqrt);
//            sqrt++;
//        }while (sqrt*sqrt < number);

        // Task2
        int i = 2;

        while (!(number % i == 0)){
            i++;
        }



    }
}
