package forloops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //Заплата - число в интервала [700...1500]
        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= browserTabs; i++) {
           //проверка кой е сайта, кой е той, имаме ли заплата;
            String nameSite = scanner.nextLine();

            switch ( nameSite){

                case"Facebook":
                    salary-= 150;//salary=salary-150
                    break;
                case"Instagram":
                    salary-= 100;
                    break;
                case"Reddit":
                    salary-= 50;
                    break;

            }
            if (salary <= 0){
                System.out.print("You have lost your salary.");
                break;
            }

        }
          if (salary > 0){
              System.out.print(salary);
          }

    }
}

