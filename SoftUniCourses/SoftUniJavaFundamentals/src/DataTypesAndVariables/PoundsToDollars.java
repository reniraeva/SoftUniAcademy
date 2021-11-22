package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 British pound = $ 1.31

        double pound = Double.parseDouble(scanner.nextLine());
        double paundInDolarsCurss = 1.31;

        System.out.printf("%.3f",pound * paundInDolarsCurss);

    }
}

