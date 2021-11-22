package NestedLoopsExercise;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        boolean isBreak = false;

        for (int rows = 1; rows <= number ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(counter++ + " ");
                if (counter > number){
                    isBreak = true;
                    break;
                }
            }
            if (isBreak){
                break;
            }
            System.out.println();
        }
    }
}
