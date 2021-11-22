package com.telerikacademy;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(a == +a && b== +b && c == +c && a != 0 && b != 0 && c != 0){
            System.out.println("+");
        }else if(a == -a && b== -b && c == -c && a != 0 && b != 0 && c != 0) {
            System.out.println("-");
        }else if(a == +a && b== +b && c == -c && a != 0 && b != 0 && c != 0){
            System.out.println("-");
        }else if(a == +a && b== -b && c == -c && a != 0 && b != 0 && c != 0){
            System.out.println("+");
        }else if(a == -a && b== -b && c == +c && a != 0 && b != 0 && c != 0){
            System.out.println("+");
        }else if(a == -a && b== +b && c == +c && a != 0 && b != 0 && c != 0){
            System.out.println("-");
        }else{
            System.out.println("0");
        }
    }
}
