package forloops;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNamber = Integer.MIN_VALUE;
        int sumNamber = 0;

        for (int i = 0; i < n; i++) {
            int namber = Integer.parseInt(scanner.nextLine());
            if (namber > maxNamber){
              maxNamber = namber;
          }
           sumNamber += namber;
        }
          sumNamber -= maxNamber;
        if ( sumNamber == maxNamber ){
          System.out.println("Yes");
          System.out.println("Sum = " + sumNamber);
        } else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sumNamber - maxNamber));
        }

    }
}
