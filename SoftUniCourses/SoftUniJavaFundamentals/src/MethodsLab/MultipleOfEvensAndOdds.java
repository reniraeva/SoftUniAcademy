package MethodsLab;

        import java.util.Scanner;

public class MultipleOfEvensAndOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumOfEventDigits(n);
        int oddSum = getSumOfOddDigits(n);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int n) {
        int oddSum = 0;
        while (true){
            int digit = Math.abs(n % 10);
            if (digit % 2 != 0){
                oddSum += digit;
            }

            n = n / 10;
            if (n == 0){
                break;
            }
        }

        return oddSum;
    }

    private static int getSumOfEventDigits(int n) {
        int evenSum = 0;
        while (true){
            int digit = Math.abs(n % 10);
            if (digit % 2 == 0){
                evenSum += digit;
            }

            n = n / 10;
            if (n == 0){
                break;
            }
        }

        return evenSum;
    }
}
