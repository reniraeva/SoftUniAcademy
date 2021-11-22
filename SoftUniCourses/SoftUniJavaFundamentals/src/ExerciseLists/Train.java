package ExerciseLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        List <Integer> wagons = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            wagons.add(Integer.parseInt(line[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        while (true){
            String[] commands = scanner.nextLine().split(" ");
            if (commands[0].equals("end")) {
                break;
            }

            if (commands[0].equals("Add")){
                int passengers = Integer.parseInt(commands[1]);
                wagons.add(passengers);
            } else {

                int addPassenger = Integer.parseInt(commands[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int current = wagons.get(i);
                    int newCapacity = current + addPassenger;
                    if (newCapacity <= maxCapacity){
                        wagons.remove(i);
                        wagons.add(i, newCapacity);
                        break;
                    }
                }
            }
        }
        //print

        for ( int p : wagons) {
            System.out.print(p + " ");

        }
    }
}
