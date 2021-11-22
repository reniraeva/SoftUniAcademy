package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// свързано с class Student

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> student = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String[]tokens = input.split("\\s+");
            String firstName= tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String town = tokens[3];
            Student students = new Student(firstName,lastName,age,town);
            student.add(students);

            input= scanner.nextLine();

        }
        String town = scanner.nextLine();
        for (Student students:student) {
            if (students.getTown().equals(town)){
                System.out.println(students);
            }
            
        }

    }
}

