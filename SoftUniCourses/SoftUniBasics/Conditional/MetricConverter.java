package Conditional;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //преобразуване разстоянието м/у следните 3мер. еденици;mm,сm,m
        //1m=1000mm; 1m=100sm

        double number = Double.parseDouble(scanner.nextLine());

        String vh = scanner.nextLine();
        String izh = scanner.nextLine();

        double result = number;

        if (vh.equals("mm")){

            if (izh.equals("cm")){
                result = number / 10;
            } else if (izh.equals("m")){
                result = number / 1000;
            }

        } else if (vh.equals("cm")){

            if (izh.equals("mm")){
                result = number * 10;
            } else if (izh.equals("m")){
                result = number / 100;
            }


        } else if (vh.equals("m")){

            if (izh.equals("cm")){
                result = number * 100;
            } else if (izh.equals("mm")){
                result = number * 1000;
            }

        }

        System.out.printf("%.3f",result );
    }
}
