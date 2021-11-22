package testTT1;

import java.util.Scanner;

public class testTT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum = sum + Integer.parseInt(String.valueOf(ch));

        }
        System.out.println(sum);


//       int number = Integer.parseInt(s);
//       sum += number % 10;
//       number = number / 10;
//        sum += number % 10;
//        number = number / 10;
//        sum += number % 10;
//        number = number / 10;
//        sum += number % 10;
//
//
//        System.out.println(sum);

    }
}
