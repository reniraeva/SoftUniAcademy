package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
              integerList.add(Integer.parseInt(input[i]));

        }

        while (true) {
            String[] commands = scanner.nextLine().split(" ");

            if (commands[0].equals("end")) {
                break;
            }

            int argument = Integer.parseInt(commands[1]);

            if (commands[0].equals("Delete")) {
                for (int i = 0; i < integerList.size(); i++) {
                    integerList.remove(Integer.valueOf(argument));
                }
            } else {
                int indexInsert = Integer.parseInt(commands[2]);
                integerList.add(indexInsert, argument);
            }
        }

        //print
        for ( Integer integer:integerList) {
            System.out.print(integer + " ");
        }
    }
}
