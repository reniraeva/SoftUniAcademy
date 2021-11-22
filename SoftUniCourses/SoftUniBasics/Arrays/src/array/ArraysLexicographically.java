package array;

import java.util.Scanner;

public class ArraysLexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] first = scanner.nextLine().toCharArray();
        char[] second = scanner.nextLine().toCharArray();
        String result = "";

        System.out.println(first.toString().compareTo(second.toString()));

        for (int i = 0; i < first.length; i++) {

            if (first.length < second.length){
                result = "First";
                break;
            }else if (first.length > second.length){
                result = "Second";
                break;
            }

            if (first[i] > second[i]){
                result = "Second";

            }else if (first[i] < second[i]){
                result = "First";

            }else {
                result ="Equal";

            }
        }


        System.out.println(result);

    }
}
