package whileloops;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradesLimit =Integer.parseInt(scanner.nextLine());


        String task = scanner.nextLine();
        //четем задачата 1-та,дакато кам. е различн от Enough
        int badGrades = 0;
        int allGradesSum = 0;
        int gradesCount = 0;//бр.н всички задачи
        String currentTask = "";//името на последната задача




        while (!task.equals("Enough")){
            //трябва да четем оценката grade
            int grade = Integer.parseInt(scanner.nextLine());
            allGradesSum += grade;
            gradesCount++;

            if (grade <= 4){
                badGrades++;
                if (badGrades == poorGradesLimit){
                    break;
                }

            }
            currentTask = task;
            task = scanner.nextLine();


        }//kr while
       double averageScore = 1.0 * allGradesSum / gradesCount ;

        // средна оценка
        String output = "";
        if (badGrades ==poorGradesLimit){
            output = String.format("You need a break, %d poor grades.",badGrades);

        } else {
            output = String.format("Average score: %.2f%n" + "Number of problems: %d%n"
            + "Last problem: %s",averageScore,gradesCount,currentTask);
        }

        System.out.println(output);

    }
}
