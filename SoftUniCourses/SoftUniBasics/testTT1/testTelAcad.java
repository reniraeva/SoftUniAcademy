package testTT1;

import java.util.Scanner;

public class testTelAcad {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      int a = Integer.parseInt(scanner.nextLine());
      int b = Integer.parseInt(scanner.nextLine());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.printf("%.0f",Math.pow(a, b));
    }
}

