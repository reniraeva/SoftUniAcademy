package Conditional;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {

// Ако фигурата е триъгълник, на следващите два реда четат две числа - дължината на страната му и дължината на височината към нея.


        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")){

            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side);

        } else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            System.out.printf("%.3f", a * b);
        } else if (figure.equals("circle")){

            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", r * r * Math.PI);

        } else if (figure.equals("triangle")){

            double c = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            System.out.printf("%.3f", (c * h)/2);


        }






    }
}
