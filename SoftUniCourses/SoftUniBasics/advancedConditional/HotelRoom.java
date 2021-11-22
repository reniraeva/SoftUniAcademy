package advancedConditional;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0;
        double priceStudio = 0;
        double totalPriseAp = 0;
        double totalPriseSt = 0;

        switch (month) {
            case"May":
            case"October":
                priceStudio = 50;
                priceApartment = 65;
                if (days > 14){
                    totalPriseSt = (priceStudio - (priceStudio * 0.30)) * days;
                    totalPriseAp = (priceApartment - (priceApartment * 0.10)) * days;
                } else if(days > 7 && days <= 14){
                    totalPriseSt = (priceStudio - (priceStudio * 0.05)) * days;
                    totalPriseAp = priceApartment  * days;
                } else {
                    totalPriseSt = priceStudio * days;
                    totalPriseAp = priceApartment * days;
                }
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv. ", totalPriseAp, totalPriseSt);
                break;
            case"June":
            case"September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if(days > 14){
                    totalPriseSt = (priceStudio - (priceStudio * 0.20)) * days;
                    totalPriseAp = (priceApartment - (priceApartment * 0.10)) * days;
                } else {
                    totalPriseSt = priceStudio * days;
                    totalPriseAp = priceApartment * days;
                }
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv. ", totalPriseAp, totalPriseSt);
                break;
            case"July":
            case"August":
                priceStudio = 76;
                priceApartment = 77;
                if(days > 14){
                    totalPriseSt = priceStudio * days;
                    totalPriseAp =  (priceApartment - (priceApartment * 0.10)) * days;;
                } else {
                    totalPriseSt = priceStudio * days;
                    totalPriseAp = priceApartment * days;
                }

                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv. ", totalPriseAp, totalPriseSt);
                break;
        }
    }
}
