import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task5MinMaxSumAndAverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int num = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("min = " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("max = " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("sum = " + Arrays.stream(numbers).sum());
        System.out.println("avg = " + String.format("%.2f", Arrays.stream(numbers).average().getAsDouble()));
    }
}
