package SoftJava;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int inputNumber = Integer.parseInt(scanner.nextLine());
//
//        while (true){
//            if (inputNumber % 2 == 0){
//                System.out.printf("The number is: %d", Math.abs(inputNumber));
//                break;
//            }else {
//                System.out.printf("Please write an even number.%n");
//                inputNumber = Integer.parseInt(scanner.nextLine());
//            }
//        }
//
//
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        while (inputNumber % 2 != 0){
            System.out.printf("Please write an even number.%n");
            inputNumber = Integer.parseInt(scanner.nextLine());

        }
        System.out.printf("The number is: %d", Math.abs(inputNumber));
    }
}



