package List;

import java.util.*;

public class RemoveAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] input =scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int element = Integer.parseInt(input[i]);
            numbers.add(element);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }

        }
        Collections.reverse(numbers);

        if (numbers.isEmpty()){
            System.out.print("empty");
        }
        printList(numbers);

    }

    private static void printList(List<Integer> numbers) {
        for (Integer n: numbers) {
            System.out.print(n+ " ");

        }
    }
}
