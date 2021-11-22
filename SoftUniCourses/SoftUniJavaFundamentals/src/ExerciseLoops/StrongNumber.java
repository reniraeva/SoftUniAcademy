package ExerciseLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        int total = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt(""+ numberAsString.charAt(i));
             int current = 1;
            for (int j = 1; j <= digit ; j++) {
                current*=j;

            }
            total+=current;

        }

        int number = Integer.parseInt(numberAsString);
        if ( total==number){
            System.out.println("yes");

        }else {
            System.out.println("no");
        }

    }
}


