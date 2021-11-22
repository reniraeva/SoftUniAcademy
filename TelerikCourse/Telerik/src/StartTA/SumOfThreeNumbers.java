package StartTA;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aNumbers = Integer.parseInt(scanner.nextLine());
        int bNumbers = Integer.parseInt(scanner.nextLine());
        int cNumbers = Integer.parseInt(scanner.nextLine());
        int sum = aNumbers + bNumbers + cNumbers;
        System.out.println(sum);

    }
}
