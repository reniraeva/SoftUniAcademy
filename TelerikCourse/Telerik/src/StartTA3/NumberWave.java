package StartTA3;

import java.util.Scanner;

public class NumberWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int numberN = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberN; i++) {
            System.out.printf("%d ",i);
        }

        for (int j = numberN - 1; j >= 1 ; j--) {
            System.out.printf("%d ",j);

        }

    }
}