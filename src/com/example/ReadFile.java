package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
   public static void main(String[] args) throws FileNotFoundException {
      String separator = File.separator;
      String path = separator+"Volumes"+separator+"SANDISK"+separator+"Projects"+separator+"JavaLessonsWithAbdulbari"+separator+"src"+separator+"hello";
      File file = new File(path);

      Scanner scanner = new Scanner(file);


      while(scanner.hasNextLine()){
         System.out.println(scanner.nextLine());
      }

      do {
         System.out.println(scanner.nextLine());
      }while (scanner.hasNextLine());



   }
}
