package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;

        for (int current = 1; current <= num; current++) {
            number = current;
            while (current > 0) {
                sum += current % 10;
                current = current / 10;
            }
            String isSpecialNum = ((sum == 5) || (sum == 7) || (sum == 11)) ? "True":"False";
            System.out.printf("%d -> %s%n", number, isSpecialNum);
            sum = 0;
            current = number;
        }

    }
}
