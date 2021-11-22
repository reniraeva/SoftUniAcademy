package FundmBasic;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String prais = "Error!";

         if (day.equals("Weekday")){
             if ((0 <= age && age<= 18) || (64 < age && age<= 122 )){
                 prais = "12$";

             } else if (18 < age && age<= 64){
                 prais = "18$";

             }
         } else if (day.equals("Weekend")){
             if ((0 <= age && age<= 18) || (64 < age && age<= 122)){
                 prais = "15$";

             } else if (18 < age && age<= 64){
                 prais = "20$";

             }

         } else if (day.equals("Holiday")){
             if  (0 <= age && age<= 18) {
                 prais = "5$";

             } else if (18 < age && age<= 64){
                 prais = "12$";

             }else if (64 < age && age<= 122){
                 prais = "10$";

             }

         }
        System.out.printf(prais);

    }

}