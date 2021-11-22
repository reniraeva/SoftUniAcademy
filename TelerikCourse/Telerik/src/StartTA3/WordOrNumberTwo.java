package StartTA3;

import java.util.Scanner;

public class WordOrNumberTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()){
                int input = Integer.parseInt(scanner.nextLine());
                result += input;
            }else {
                String text = scanner.nextLine();
                stringBuilder.append(text);
                stringBuilder.append("-");
            }
        }

        if (stringBuilder.length() > 0){
            System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));
        } else {
            System.out.println("no words");
        }

        System.out.println(result);

    }
}
