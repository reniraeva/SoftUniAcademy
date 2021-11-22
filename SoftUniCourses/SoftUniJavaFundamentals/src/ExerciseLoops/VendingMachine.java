package ExerciseLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();
        double totalMany = 0;
        while (!input.equals("Start")){
            double current = Double.parseDouble(input);
            if (current == 0.1 || current == 0.2 || current == 0.5 || current == 1 || current == 2 ){
                totalMany = totalMany +current;
            } else {
                System.out.println(String.format("Cannot accept %.2f",current));
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")){
            switch (input){
                case "Nuts":
                    if (totalMany >= 2){
                        totalMany= totalMany -2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalMany >= 0.7){
                        totalMany= totalMany - 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalMany >= 1.5){
                        totalMany= totalMany - 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalMany >= 0.8){
                        totalMany= totalMany - 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalMany >= 1){
                        totalMany= totalMany - 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalMany);
    }
}

