package FundmBasic;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double britishPound = Double.parseDouble(scanner.nextLine());

        double paundInDolarsCurss = 1.31;
        System.out.printf("%.3f",britishPound * paundInDolarsCurss);
    }
}
