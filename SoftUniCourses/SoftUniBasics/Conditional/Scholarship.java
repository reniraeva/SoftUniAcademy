package Conditional;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrede = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double sosialSchol = 0;
        double gradeScholariship =0;
        if (income < minSalary && averageGrede > 4.5){
            sosialSchol = Math.floor(minSalary * 0.35);
        }
        if (averageGrede >=5.5){
            gradeScholariship =Math.floor(averageGrede * 25);
        }

        if (sosialSchol > gradeScholariship){
            System.out.printf("You get a Social scholarship %.0f BGN", sosialSchol );
        } else if (sosialSchol < gradeScholariship ){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholariship );
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
