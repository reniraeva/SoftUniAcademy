package FundmBasic;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int metars = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",(double)metars/1000.0);

    }
}
