package telerikacademy;

import java.util.Scanner;
//Write a program that finds the biggest of three numbers.
public class TheBiggestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numberOne = sc.nextLine();
        String numberTwo = sc.nextLine();
        String numberThree = sc.nextLine();

        double first = Double.parseDouble(numberOne);
        double second = Double.parseDouble(numberTwo);
        double third = Double.parseDouble(numberThree);

        if(first > second && first > third){
            System.out.println(first);
        }else if(second > first && second > third){
            System.out.println(second);
        }else if(third > first && third > second){
            System.out.println(third);
        }
    }
}
