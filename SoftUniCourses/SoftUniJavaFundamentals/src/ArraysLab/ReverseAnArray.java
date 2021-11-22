package ArraysLab;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elementse = scanner.nextLine().split(" ");

        for (int i = 0; i < elementse.length/2; i++) {
          int index = elementse.length -1-i;
            String newElement = elementse[i];
            elementse[i] = elementse[index];
            elementse[index] =newElement;

        }
        System.out.println(String.join(" ",elementse));
    }
}
