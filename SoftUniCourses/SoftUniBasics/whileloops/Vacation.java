package whileloops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //четем.нуж.пари и налични;
        double needMoney = Double.parseDouble(scanner.nextLine());
        double availabMoney = Double.parseDouble(scanner.nextLine());
        // спираме- ако харчи  5 послед. пари или стигнем до сумата,

        int days = 0;//бр.на дните за спест или  хар.
        int spendDays = 0;//бр. дни за харч.
        while (needMoney > availabMoney){
            //харчим/spend или пестим/save

            String action = scanner.nextLine();//действието четем
            double actionMoney = Double.parseDouble(scanner.nextLine());//парите от това действие
            days++;

            if (action.equals("spend")){
                spendDays++;
                availabMoney -= actionMoney;
                if (availabMoney < 0){
                    availabMoney = 0;
                }
                if (spendDays == 5){
                    System.out.printf("You can't save the money.%n" + "%d",days);
                    break;
                }

            } else if (action.equals("save")){
                spendDays = 0;
                availabMoney += actionMoney;
            }

        }

        if (needMoney <= availabMoney){
            System.out.printf("You saved the money for %d days.",days);


        }

    }
}
