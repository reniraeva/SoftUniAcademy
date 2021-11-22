package firststep;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //сума = депозирана сума  + срок на депозита *
        // *((депозирана сума * годишен лихвен процент ) / 12)


        double depositedAmount = Double.parseDouble(scanner.nextLine());
        int srokDeposit = Integer.parseInt(scanner.nextLine());
        double yearLihvenProtsent = Double.parseDouble(scanner.nextLine())/100;

       double sum = depositedAmount + srokDeposit *(depositedAmount * yearLihvenProtsent / 12) ;

        System.out.println(sum);


    }




}
