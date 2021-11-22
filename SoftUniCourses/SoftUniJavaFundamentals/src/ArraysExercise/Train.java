package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waggons = Integer.parseInt(scanner.nextLine());

        int [] train = new int[waggons];


        for (int i = 0; i < train.length; i++) {
            train[i]=Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for ( int waggon:train) {
            sum= sum + waggon;
            System.out.print(waggon + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
