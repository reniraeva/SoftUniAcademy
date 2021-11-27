package students;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int studentAge = Integer.parseInt(scanner.nextLine());
        double studentGrade = Double.parseDouble(scanner.nextLine());

        Student student = new Student(studentName, studentAge, studentGrade);


        System.out.println(student.show(studentName));

    }
}
