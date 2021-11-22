package com.telerikacademy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TheBiggestOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#.##");

        if(a>=b && a>=c){
            System.out.println(formatter.format(a));
        }else if(b>=a && b>=c){
            System.out.println(formatter.format(b));
        }else if(c>=a && c>=b){
            System.out.println(formatter.format(c));
        }
    }
}
