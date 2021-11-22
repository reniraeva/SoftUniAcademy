package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintOfAscciTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput =Integer.parseInt(scanner.nextLine());
        int secandInput =Integer.parseInt(scanner.nextLine());


        for (int i = firstInput; i <= secandInput; i++) {
             System.out.printf("%c ",i );

        }

    }
}
