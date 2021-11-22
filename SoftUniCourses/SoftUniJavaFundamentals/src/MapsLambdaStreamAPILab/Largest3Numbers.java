package MapsLambdaStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine()
                .split(" ");


        Arrays.stream(input)
                .map(Integer::parseInt)
                .sorted( )
                .limit(3)
                .forEach(System.out::println);


    }
}
