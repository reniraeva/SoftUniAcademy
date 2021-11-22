package StartTA;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reads = Double.parseDouble(scanner.nextLine());

        double perimeter = (2 * Math.PI) * reads;//Периметър = 2 * π * r
        double area = Math.PI * reads * reads;//Лице = π * r * r
        System.out.printf("%.2f%n%.2f",perimeter,area);
    }
}
