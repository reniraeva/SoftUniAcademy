package Conditional;

import java.util.Scanner;

public class WorldSwimRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSek = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSek = Double.parseDouble(scanner.nextLine());

        double totalSw = distance * timeSek;
        double totalZabIime = (Math.floor(distance / 15)) * 12.5;
        double totalTime = (totalSw + totalZabIime);
         double was = totalTime - recordSek;

        if (recordSek <= totalTime){
            System.out.printf("No, he failed! He was %.2f seconds slower.", was);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime );
        }

    }
}
