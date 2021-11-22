package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int n =Integer.parseInt(scanner.nextLine());

        int total = 0;

        for (int i = 0; i < n; i++) {
            int letter = scanner.nextLine().charAt(0);
             total = total + letter;
            
        }
        System.out.printf("The sum equals: %d", total);
    }
}
