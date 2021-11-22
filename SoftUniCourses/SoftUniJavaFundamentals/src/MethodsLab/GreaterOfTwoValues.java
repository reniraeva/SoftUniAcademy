package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("int")){
            int one = Integer.parseInt(scanner.nextLine());
            int two = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(one,two));
        }else if (input.equals("String")){
            String one =scanner.nextLine();
            String two =scanner.nextLine();
            System.out.println(getMax(one,two));
        }else if (input.equals("char")){
            char one = scanner.nextLine().charAt(0);
            char two = scanner.nextLine().charAt(0);
            System.out.println(getMax(one,two));
        }

    }

    public static int getMax(int one, int two) {
        return Math.max(one, two);
    }
    public static String getMax(String one, String two) {
        if (one.compareTo(two) >= 0){
            return one;
        }
        return two;
    }
    public static char getMax(char one, char two) {
        if (one >= two){
            return one;
        }
        return two;
    }

}

//    static char getMax(char first, char second) {
//        return (char) Math.max(first, second);
//    }