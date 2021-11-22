package FundmBasic;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = number; i <= secondNumber ; i ++ ) {
            System.out.print(i+ " ");
            sum = sum + i;
        }

        System.out.printf("%nSum: %d",sum);
    }
}
