package firststep;

import java.awt.geom.Arc2D;
import java.util.Scanner;

public class PetofShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double dog = Double.parseDouble(scanner.nextLine());
        double anadarAnemals = Double.parseDouble(scanner.nextLine());
        double total = (dog * 2.50)+ (anadarAnemals * 4.0);

        System.out.print(total);

    }
}
