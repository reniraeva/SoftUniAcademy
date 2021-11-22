package nestedloops;

import java.util.Scanner;

public class Travellinggg {
    public static void main(String[] main){

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String destination = scanner.nextLine();
            if(destination.equals("End")) {
                break;
            }
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while(budget > sum){
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
        }
    }
}



