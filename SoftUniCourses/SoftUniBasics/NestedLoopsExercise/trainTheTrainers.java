package NestedLoopsExercise;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumAll = 0 ;
        int countAll = 0;

        while (! command.equals("Finish")){
            String presentation = command;
            double sumGrade = 0;

            for (int juri = 1; juri <= countJury; juri++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countAll++;
                sumGrade += grade;
                sumAll += grade;
            }
            double averageGrade = sumGrade / countJury;
            System.out.printf("%s - %.2f.%n",presentation,averageGrade);
            command = scanner.nextLine();

        }
         double averageAll = sumAll / countAll;
        System.out.printf("Student's final assessment is %.2f.%n", averageAll);

    }
}
