package forloops;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number < 200){
                c1++;
            }else if (number < 400){
                c2++;
            }else if (number < 600){
                c3++;
            } else if( number < 800){
                c4++;
            } else {
                c5++;
            }
        }

        p1 = (c1*1.0) / n * 100;
        p2 = (c2*1.0)/ n * 100;
        p3 = (c3*1.0 )/ n * 100;
        p4 = (c4*1.0 )/ n * 100;
        p5 = (c5*1.0)/ n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
