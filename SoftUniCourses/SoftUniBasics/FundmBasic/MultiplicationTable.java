package FundmBasic;

import java.util.Scanner;

public class MultiplicationTable {
    //  public static void main(String[] args) {
    //   Scanner scanner = new Scanner(System.in);
    // int number = Integer.parseInt(scanner.nextLine());
    // for (int i = 1; i <=10 ; i++) {
    // System.out.printf("%d X %d = %d%n",number,i, number * i);
    // }
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
           multiplier++;

        } while (multiplier <= 10) ;


    }
}

