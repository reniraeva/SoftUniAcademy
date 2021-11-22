package StartTA2;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double result = a * b * c;


        if (result > 0 ){
            System.out.print("+");

        } else if (result <0 ){
            System.out.print("-");
        }else {
            System.out.print("0");
        }

    }
}

