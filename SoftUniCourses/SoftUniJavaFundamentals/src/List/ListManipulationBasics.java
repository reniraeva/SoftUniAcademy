package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int current = Integer.parseInt(input[i]);
            numbers.add(current);
        }

        while (true) {
            String[] differentCommand = scanner.nextLine().split(" ");
            if (differentCommand[0].equals("end")){
                break;
            }

            String comandName = differentCommand[0];
            int argument = Integer.parseInt(differentCommand[1]);

            switch (comandName) {
                case "Add":
                    numbers.add(argument);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(argument));
                    break;
                case "RemoveAt":
                    numbers.remove(argument);
                    break;
                case "Insert":
                    int indexInsert = Integer.parseInt(differentCommand[2]);
                    numbers.add(indexInsert, argument);
                    break;
            }
        }

        for (int n: numbers) {
            System.out.print(n + " ");
        }
    }
}