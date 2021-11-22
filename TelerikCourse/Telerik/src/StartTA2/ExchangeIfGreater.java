package StartTA2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (a > b){

            System.out.printf("%s %s", decimalFormat.format(b) ,decimalFormat.format(a));

        }else {

            System.out.printf("%s %s", decimalFormat.format(a) ,decimalFormat.format(b));
        }




    }
}
