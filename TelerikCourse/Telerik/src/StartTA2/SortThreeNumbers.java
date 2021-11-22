package StartTA2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());


        if ((a >= b && b >= c) && (a >= c)){

            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            System.out.printf("%s %s %s", decimalFormat.format(a), decimalFormat.format(b), decimalFormat.format(c));


             } else if ((a >= b && b<= c) && (a <= c)){

                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                System.out.printf("%s %s %s", decimalFormat.format(a), decimalFormat.format(c), decimalFormat.format(b));

             } else if ((a <= b && b <= c)&&(a <=c)) {

                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                System.out.printf("%s %s %s", decimalFormat.format(c), decimalFormat.format(b), decimalFormat.format(a));

             }else if ((a<=b && b>=c) && (a <= c)) {

                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                System.out.printf("%s %s %s", decimalFormat.format(b), decimalFormat.format(c), decimalFormat.format(a));

             }else  if ((a<= c && b<= c)&& (a<=b)) {

                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                System.out.printf("%s %s %s", decimalFormat.format(c), decimalFormat.format(b), decimalFormat.format(a));

             } else if (a== b && a== c && b== c) {
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                System.out.printf("%s %s %s", decimalFormat.format(c), decimalFormat.format(c), decimalFormat.format(c));

             } else if (((a > b && b < c) && (c > a))){

               DecimalFormat decimalFormat = new DecimalFormat("#.#");
               System.out.printf("%s %s %s", decimalFormat.format(c), decimalFormat.format(a), decimalFormat.format(b));

            } else if (((a == b && b<= c) && (a <= c))){
              DecimalFormat decimalFormat = new DecimalFormat("#.#");
              System.out.printf("%s %s %s", decimalFormat.format(c), decimalFormat.format(a), decimalFormat.format(a));

            }


            }
        }

