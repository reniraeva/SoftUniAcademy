package NestedLoopsExercise;

import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int furst = 1; furst < n; furst++) {
         for (int second = 1; second < n ; second++) {
         for (char third = 'a'; third < 'a' + l; third++) {
          for (char forth = 'a'; forth < 'a' + l; forth++) {
           for (int fifth = 1; fifth <= n ; fifth++) {
               if (fifth > furst && fifth > second){

                   System.out.printf("%d%d%c%c%d ",furst,second,third,forth,fifth );
               }
             }
            }
           }
          }
        }

    }
}
