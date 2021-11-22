package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String [] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();

        for (int i = 0; i < inputNumbers.length; i++) {
            int current = Integer.parseInt(inputNumbers[i]);
            numbers.add(current);
        }
        for (int i = 0; i < numbers.size()/2; i++) {
            int left = numbers.get(i);
            int right = numbers.get(numbers.size()-1-i);
            sum.add(left + right);
        }

        if (numbers.size() % 2 == 1){
            sum.add(numbers.get(numbers.size()/2));
        }

        for ( Integer n: sum) {
            System.out.print(n + " ");
        }

    }
}
