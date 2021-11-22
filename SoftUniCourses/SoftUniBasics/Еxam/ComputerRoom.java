package Еxam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String dayNight =scanner.nextLine(); //"day", "night"

        double totalPrice = 0.0;
        double pricePeopleHour = 0.0;

        switch (month){
            case "march":
            case "april":
            case "may":
                if (dayNight.equals("day")){
                    pricePeopleHour = 10.5;
                } else {
                    pricePeopleHour = 8.40;
                }
                  break;

            case "june":
            case "july":
            case "august":
                if (dayNight.equals("day")){
                    pricePeopleHour = 12.60;
                } else {
                    pricePeopleHour = 10.20;
                }
                break;

        }
        if (people >= 4){
            pricePeopleHour = pricePeopleHour -(pricePeopleHour * 0.10);
        }

        if (hours >= 5) {
            pricePeopleHour = pricePeopleHour -(pricePeopleHour * 0.50);
        }
        totalPrice = pricePeopleHour * hours * people;
        System.out.printf("Price per person for one hour: %.2f%nTotal cost of the visit: %.2f",pricePeopleHour,totalPrice);

    }
}
