package ArraysLab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] numbersArString = line.split(" ");
         int [] numbers = new int[numbersArString.length];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(numbersArString[i]);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int number : numbers){
            if (number % 2 == 0){
              evenSum = evenSum + number;
            }else {
                oddSum = oddSum + number;
            }

        }
        System.out.println(evenSum- oddSum);
    }
}
