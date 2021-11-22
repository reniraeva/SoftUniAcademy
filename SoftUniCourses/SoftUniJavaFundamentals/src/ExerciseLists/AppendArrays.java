package ExerciseLists;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        String []input = scanner.nextLine().split("\\|");
        for (int i = input.length-1; i >=0 ; i--) {
           String[] arr = input[i].trim().split("\\s+");
            for (String element: arr) {

                result.add(element);
            }
            result.remove("");

        }
        System.out.println(String.join(" ",result));

    }
}
