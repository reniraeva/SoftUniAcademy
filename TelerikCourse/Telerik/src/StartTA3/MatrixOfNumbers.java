package StartTA3;

import java.util.Scanner;

public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {

                System.out.printf("%d ",(row+1) + col);

            }
            System.out.println();
        }
    }
}

