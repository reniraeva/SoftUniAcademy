package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterTank = 255;
        int sumOfLiters = 0;


        for (int i = 0; i < n ; i++) {
            int litersOfwater = Integer.parseInt(scanner.nextLine());

            if (litersOfwater +sumOfLiters >waterTank){
                System.out.println("Insufficient capacity!");

            }else {
                sumOfLiters = sumOfLiters + litersOfwater;
            }
        }
        System.out.println(sumOfLiters);
    }
}
