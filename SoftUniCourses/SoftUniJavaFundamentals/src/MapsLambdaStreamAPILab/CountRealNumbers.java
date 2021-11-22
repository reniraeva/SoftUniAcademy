package MapsLambdaStreamAPILab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double[] nums = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();


        Map<Double, Integer> numbers = new TreeMap<>();
        // dob - k , int kolko put sme go sreshali entry-element

        for (double number : nums) {
            //number  ako
            if (!numbers.containsKey(number)) {

                numbers.put(number, 1);

            } else {
                //imame chilo s tozi kl
                int occurrences = numbers.get(number);

                occurrences++;
                numbers.put(number, occurrences);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

