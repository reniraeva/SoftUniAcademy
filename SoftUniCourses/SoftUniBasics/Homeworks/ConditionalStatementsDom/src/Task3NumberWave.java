import java.util.Scanner;

public class Task3NumberWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int max = num;
        int current = 0;
        for (int i = 1; i <= num * 2 - 1; i++) {
            if (i > max) current = --max;
            else current = i;
            System.out.print(current + " ");
        }
    }
}

