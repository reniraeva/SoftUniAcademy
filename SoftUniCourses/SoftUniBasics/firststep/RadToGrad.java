package firststep;

import java.util.Scanner;

public class RadToGrad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        //String input = scanner.nextLine();

        double rad = Double.parseDouble(scanner.nextLine());
        double grad = rad * 180 / Math.PI;

        System.out.printf("%.0f", grad);

    }
}
