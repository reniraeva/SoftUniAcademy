package firststep;

import java.util.Scanner;

public class ProjectsofCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

///изхода"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} projects."
         //вход 2 реда , име на архитрк -текст;бр. проекти-цяло число
        // да се изчеслят часовете за изготвяне на 1 проект

        String architect = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects * 3;

        System.out.printf("The architect %s will need %s hours to complete %s project/s.", architect , hours , projects);


    }
}
