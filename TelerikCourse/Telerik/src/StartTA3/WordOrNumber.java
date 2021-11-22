package StartTA3;

import java.util.Scanner;

public class WordOrNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println(input + 1);
        }else {
            String text = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder(text);
            System.out.println(stringBuilder.reverse());
        }
    }
}
