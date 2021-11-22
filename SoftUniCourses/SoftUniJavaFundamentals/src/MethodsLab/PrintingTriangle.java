package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLine = Integer.parseInt(scanner.nextLine());
        printTriagle(maxLine);
    }

    private static void printTriagle(int maxLine) {
        printTopHalf(maxLine);
        printBottHalf(maxLine-1);
    }

       private static void printTopHalf(int number) {
        for (int i = 1; i <= number; i++) {
            printRow(1,i);
            System.out.println();

        }
    }
      private static void printBottHalf(int longLine) {
          for (int i = longLine; i >=1 ; i--) {
              printRow(1,i);
              System.out.println();
          }

    }

    private static void printRow(int from, int to) {


        for (int i = from; i <=to ; i++) {
            System.out.print(i+ " ");

        }
    }


}
