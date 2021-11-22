package forloops;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if(current < min){
                min = current;
            }
            if(current > max){
                max = current;
            }

        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
