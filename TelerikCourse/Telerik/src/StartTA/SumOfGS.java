package StartTA;

import java.util.Scanner;

public class SumOfGS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 3;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers ; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (current >= maxNumber){
                maxNumber = current;
            }
            if (current <= minNumber){
                minNumber = current;
            }
        }

        System.out.printf("%d", maxNumber + minNumber);

    }
}
// // Input 3 numbers, each on separate line
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int min = Math.min(a, Math.min(b, c));
//        int max = Math.max(a, Math.max(b, c));
//
//        int sum = min + max;
//
//        System.out.println(sum);