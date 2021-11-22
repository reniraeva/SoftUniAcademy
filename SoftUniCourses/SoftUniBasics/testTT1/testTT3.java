package testTT1;

import java.util.Scanner;

public class testTT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours =Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        int resultDayOfSeconds = (((days*24)*60)*60);
        int resultHoursOfSeconds =((hours*60)*60);
        int resultMinutsOfSeonds= (minutes*60);
        int totalResult=(resultDayOfSeconds+resultHoursOfSeconds+resultMinutsOfSeonds+seconds);
        System.out.print(totalResult);
    }
}
