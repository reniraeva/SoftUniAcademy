package ArraysLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int length = scanner.nextInt();

        String str2 = scanner.nextLine();

        int [] arr = new int[8];
        ArrayList list = new ArrayList();

//        String joined = String.join(" ", arr);

        for (int i = 0; i < arr.length - 1; i++) {
            char cur = str2.charAt(i);
            System.out.println(cur);
//            int cur = scanner.nextInt();
//            arr[i] = cur;

        }

//        for (int number:arr) {
//            System.out.println(number);
//        }



    }
}
