package StartTA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double x1 = 0;
        double x2 = 0;

        double disk = Math.pow(b , 2) - (4*a*c);

        if (disk == 0){
            x1 = -(b/(2*a));
            x2 = x1;
        } else if (disk > 0){
            x1 = (-b - Math.sqrt(disk)) / (2*a);
            x2 = (-b + Math.sqrt(disk)) / (2*a);;
        } else {
            System.out.println("No roots.");
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.printf("x1=%s;x2=%s",decimalFormat.format(x1),decimalFormat.format(x2));

    }
}
//     double a = Double.parseDouble(sc.nextLine());
//        double b = Double.parseDouble(sc.nextLine());
//        double c = Double.parseDouble(sc.nextLine());
//
//        double d = (b * b) - 4 * a * c;
//
//        double x1 = (-b - Math.sqrt(d)) / (2 * a);
//        double x2 = (-b + Math.sqrt(d)) / (2 * a);
//        System.out.printf("x1=%.1f; x2=%.1f", x1, x2);