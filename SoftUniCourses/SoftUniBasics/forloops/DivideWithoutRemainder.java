package forloops;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number % 2 == 0){
                c1++;
            }
            if (number % 3 == 0){
                c2++;
            }
            if (number % 4 == 0){
                c3++;
            }
        }

        p1 = (c1*1.0) / n * 100;
        p2 = (c2*1.0)/ n * 100;
        p3 = (c3*1.0 )/ n * 100;

//На първият ред - процентът на числата които се делят на 2
//На вторият ред - процентът на числата които се делят на 3
//На третият ред - процентът на числата които се делят на 4
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}





