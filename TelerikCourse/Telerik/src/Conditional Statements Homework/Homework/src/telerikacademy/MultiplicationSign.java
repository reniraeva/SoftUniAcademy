package telerikacademy;

import java.util.Scanner;
//Write a program that shows the sign (+, - or 0) of the product of three real numbers,
// without calculating it. * Use a sequence of if operators.

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numberOne = sc.nextLine();
        String numberTwo = sc.nextLine();
        String numberThree = sc.nextLine();

        double numberUno = Double.parseDouble(numberOne);
        double numberDos = Double.parseDouble(numberTwo);
        double numberTres = Double.parseDouble(numberThree);

        if((numberUno * numberDos * numberTres) > 0 ){
            System.out.println("+");
        }else if((numberUno * numberDos * numberTres )< 0){
            System.out.println("-");
        }else {
            System.out.println("0");
        }
    }
}
