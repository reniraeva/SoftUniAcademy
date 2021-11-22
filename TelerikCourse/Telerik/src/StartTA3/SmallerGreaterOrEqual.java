package StartTA3;

import java.util.Scanner;

public class SmallerGreaterOrEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int previous = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        result.append(previous);

        for (int i = 1; i < n; i++) {
           int current = Integer.parseInt(scanner.nextLine());

           if (previous > current){
               result.append(">");
           } else if (previous < current){
               result.append("<");
           } else {
               result.append("=");
           }
            result.append(current);
           previous = current;
         }

        System.out.print(result);
    }
}
