package ArraysLab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String[] firstArray = scanner.nextLine().split(" ");
         String[] secondArray= scanner.nextLine().split(" ");


         int sum = 0;
        for (int i = 0; i <firstArray.length ; i++) {
            if (!firstArray[i].equals(secondArray[i])){
                System.out.printf("Arrays are not identical. Found difference at %d index.%n",i);
                return;
            }
           sum += Integer.parseInt(firstArray[i]);
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
