package StartTA;

import java.util.Scanner;

public class NumberComparer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());

         //first decision
         System.out.println(a > b ?  a : b);

        //second solution
        //int max = Math.max(a,b);
        //System.out.println(max);




    }
}

