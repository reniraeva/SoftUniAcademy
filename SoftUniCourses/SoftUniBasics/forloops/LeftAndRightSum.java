package forloops;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        // read
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()) ;

        // logic
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + number;
        }

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }
        // print
        if (leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
