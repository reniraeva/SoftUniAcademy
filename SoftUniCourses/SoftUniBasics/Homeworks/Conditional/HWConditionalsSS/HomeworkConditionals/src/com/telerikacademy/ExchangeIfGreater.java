package com.telerikacademy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#.##");

        if(a>b){
            System.out.println(formatter.format(b) + " " + formatter.format(a));
        }else if(b>a){
            System.out.println(formatter.format(a) + " " + formatter.format(b));
        }

    }
}
