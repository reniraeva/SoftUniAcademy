package telerikacademy;

import java.util.Scanner;
//Write a program that enters 5 numbers (each number will be on a separate/new line),
// calculates and prints the biggest of them.
public class TheBiggestOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numberOne = sc.nextLine();
        String numberTwo = sc.nextLine();
        String numberThree = sc.nextLine();
        String numberFour = sc.nextLine();
        String numberFive = sc.nextLine();

        double first = Double.parseDouble(numberOne);
        double second = Double.parseDouble(numberTwo);
        double third = Double.parseDouble(numberThree);
        double fourth = Double.parseDouble(numberFour);
        double fifth = Double.parseDouble(numberFive);

        if(first > second && first > third && first > fourth && first > fifth){
            System.out.println(first);
        }else if(first < second && second > third && second > fourth && second > fifth){
            System.out.println(second);
        }else if(first < third && fourth < third && third > second && third > fifth){
            System.out.println(third);
        }else if(first < fourth && second < fourth && fourth > third && fourth > fifth){
            System.out.println(fourth);
        }else if(first < fifth && fifth > second && fifth > third && third < fifth){
            System.out.println(fifth);
        }
    }
}
