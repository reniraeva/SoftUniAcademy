package nestedloops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = "";
        double budget = 0;
        double money = 0;

        destination = scanner.nextLine();

        while (!destination.equals("End")){
            budget = Double.parseDouble(scanner.nextLine());
            while (true){
                money += Double.parseDouble(scanner.nextLine());

                if (money >= budget){
                    System.out.printf("Going to %s!%n", destination);
                }

                if (!scanner.hasNextDouble()){
                    destination = scanner.nextLine();
                    money = 0;
                    break;
                }
            }
        }
    }
}
