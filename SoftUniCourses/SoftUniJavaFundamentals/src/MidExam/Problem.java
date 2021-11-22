package MidExam;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());
        double sum = priceApron * (Math.ceil(students * 1.2)) + priceEgg * 10 * students + priceFlour * (students - (students / 5));


        if (sum <= budget){
            System.out.printf("Items purchased for %.2f$.", Math.ceil(sum));
        }else {
            double needed = sum - budget;
            System.out.printf("%.2f$ more needed.", Math.ceil(needed));
        }


    }
}
