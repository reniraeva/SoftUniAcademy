package testTT1;

import java.util.Scanner;

public class travelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCity = scanner.nextLine();//("Bansko", "Borovets", "Varna" или "Burgas")
        String typeofPackage = scanner.nextLine();//("noEquipment", "withEquipment", "noBreakfast" или "withBreakfast")
        String vip = scanner.nextLine();//"yes" или "no"
        int day =Integer.parseInt(scanner.nextLine());

        int typeNoEquipment = 80;
        int typeWithEquipment = 100;
        int typeNoBreakfast = 100;
        int typeWithBreakfast = 130;

        double vipNoEquipment = 0.05;
        double vipWithEquipment = 0.10;
        double vipeNoBreakfast = 0.07;
        double vipeWithBreakfast = 0.12;
        double finalPrice = 0 ;

   switch (nameOfCity) {
              case "Bansko":
              case "Borovets":
                  if (day < 1){
                      System.out.println("Days must be positive number!");
                      break;
                  }
                  if (typeofPackage.equals("noEquipment")) {
                      finalPrice = typeNoEquipment * day;
                      if (day > 7) {
                          finalPrice = typeNoEquipment * (day - 1);
                      }

                      if (vip.equals("yes")) {
                          finalPrice = (typeNoEquipment - (typeNoEquipment * vipNoEquipment)) * day;

                      }
                  } else if (typeofPackage.equals("withEquipment")){
                      finalPrice = typeWithEquipment * day;

                      if (day > 7) {
                          finalPrice = typeWithEquipment * (day - 1);
                      }
                      if (vip.equals("yes")) {
                          finalPrice = (typeWithEquipment - (typeWithEquipment * vipWithEquipment)) * day;
                      }
                  }else {
                      System.out.println("Invalid input!");
                  }
                  System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
                  break;
              case "Varna":
              case "Burgas":

                  if (typeofPackage.equals("noBreakfast")) {
                      finalPrice = typeNoBreakfast * day;
                      if (day > 7) {
                          finalPrice = typeNoBreakfast * (day - 1);
                      }
                      if (vip.equals("yes")) {
                          finalPrice = (typeNoBreakfast - (typeNoBreakfast * vipeNoBreakfast)) * day;

                      }
                  } else if (typeofPackage.equals("withBreakfast")){
                      finalPrice = typeWithBreakfast * day;
                      if (day > 7) {
                          finalPrice = typeWithBreakfast * (day - 1);
                      }
                      if (vip.equals("yes")) {
                          finalPrice = (typeWithBreakfast - (typeWithBreakfast * vipeWithBreakfast)) * day;

                      }
                  }else {
                      System.out.println("Invalid input!");
                  }
                  System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
                  break;
               default:
                  System.out.println("Invalid input!");
          }


    }
}
