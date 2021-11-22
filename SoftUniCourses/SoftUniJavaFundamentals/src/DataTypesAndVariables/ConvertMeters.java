package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int meters = Integer.parseInt(scanner.nextLine());

         double kilometars = meters/ 1000.0;
        System.out.printf("%.2f",kilometars);
    }
}
