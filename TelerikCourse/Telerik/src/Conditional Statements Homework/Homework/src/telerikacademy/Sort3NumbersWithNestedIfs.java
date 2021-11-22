package telerikacademy;

import java.util.Scanner;
//Write a program that enters 3 real numbers and prints them sorted in descending order. * Use nested if statements.
//Note: Don’t use arrays and the built-in sorting functionality.

public class Sort3NumbersWithNestedIfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        double numberOne = Double.parseDouble(a);
        double numberTwo = Double.parseDouble(b);
        double numberThree = Double.parseDouble(c);


        if(numberOne > numberTwo && numberOne > numberThree){
            if(numberTwo > numberThree){
                System.out.println(numberOne + " " + numberTwo + " " + numberThree);
            }else{
                System.out.println(numberOne + " " + numberThree + " "+ numberTwo);
            }
        }else if(numberTwo > numberOne && numberTwo > numberThree) {
            if (numberOne > numberThree) {
                System.out.println(numberTwo + " " + numberOne + " " + numberThree);
            } else {
                System.out.println(numberTwo + " " + numberThree + " " + numberOne);
            }
        }else if(numberThree > numberTwo && numberThree > numberOne) {
            if (numberTwo > numberOne) {
                System.out.println(numberThree + " " + numberTwo + " " + numberOne);
            } else {
                System.out.println(numberThree + " " + numberOne + " " + numberTwo);
            }
        }else{
            System.out.println(numberThree + " " + numberOne + " " + numberTwo);
        }
    }
}
