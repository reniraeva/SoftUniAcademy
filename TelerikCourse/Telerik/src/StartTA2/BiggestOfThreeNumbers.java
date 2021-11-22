package StartTA2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numbers = 3;
        double maxNumber = Integer.MIN_VALUE;


        for (int i = 0; i < numbers ; i++) {
            double current = Double.parseDouble(scanner.nextLine());

            maxNumber = Math.max(maxNumber, current);

        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.printf("%s", decimalFormat.format(maxNumber));

    }

}
