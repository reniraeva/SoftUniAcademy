package StartTA3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MinMaxSumAndAverageOfnNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double avg = 0;


        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            min = Math.min(current,min);
            max = Math.max(current,max);
            sum += current;
        }

        avg = (double) sum / n;
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
        System.out.println("sum = "+ sum);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("avg = " + decimalFormat.format(avg));
    }
}
