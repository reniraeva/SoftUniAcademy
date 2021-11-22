package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRating = Arrays.stream(scanner.nextLine().split(", ")).map(Integer :: parseInt).collect(Collectors.toList());
        int startIndex = Integer.parseInt(scanner.nextLine());
        String comand = scanner.nextLine();

        int rightSum = 0;
        int leftSum = 0;

        switch (comand){

            case "cheap":
                int element = priceRating.get(startIndex);
                for (int i = 0; i < startIndex; i++) {
                    int current = priceRating.get(i);
                    if (element >= current) {
                        leftSum += current;
                    }
                }
                for (int i = startIndex + 1 ; i < priceRating.size(); i++) {
                    int current = priceRating.get(i);
                    if (element >= current) {
                        rightSum += current;
                    }
                }
                if (leftSum >= rightSum){
                    System.out.println("Left - " + leftSum);
                }else {
                    System.out.println("Right - " + rightSum);
                }

                break;
            case "expensive":
                int elementExp = priceRating.get(startIndex);
                for (int i = 0; i < startIndex; i++) {
                    int current = priceRating.get(i);
                    if (elementExp <= current) {
                        leftSum += current;
                    }
                }
                for (int i = startIndex + 1 ; i < priceRating.size(); i++) {
                    int current = priceRating.get(i);
                    if (elementExp <= current) {
                        rightSum += current;
                    }
                }
                if (leftSum >= rightSum){
                    System.out.println("Left - " + leftSum);
                }else {
                    System.out.println("Right - " + rightSum);
                }

                break;
        }

    }
}
