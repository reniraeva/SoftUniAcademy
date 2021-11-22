package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = people/ capacity;

        if (people <= capacity){
            courses = 1;
        }else if (people % capacity != 0){
          courses = courses+1;

       }
            System.out.println(courses);
        }

    }

