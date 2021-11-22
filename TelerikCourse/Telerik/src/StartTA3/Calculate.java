package StartTA3;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberN = Integer.parseInt(scanner.nextLine());
        int numberX = Integer.parseInt(scanner.nextLine());
        double sum  = 1.0;//1 + 1!/x + 2!/x2 + … + n!/x^n

        double previous = 1;

        for (int i = 1; i <= numberN; i++) {
            //(previous_element) * i / x
            double curent = previous * i/numberX;
            sum += curent;
            previous = curent;

        }

        System.out.printf("%.5f",sum);
    }
}
