package com.telerikacademy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BeerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time:");
        String input = scanner.nextLine();
        try {

            SimpleDateFormat parser = new SimpleDateFormat("hh:mm a");
            Date givenTime = parser.parse(input);
            String earliest = "01:00 PM";
            String latest = "02:59 AM";

            Date earliestTime = parser.parse(earliest);
            Date latestTime = parser.parse(latest);

            if (givenTime.after(latestTime) && givenTime.before(earliestTime)) {
                System.out.println("non-beer time");
            } else {
                System.out.println("beer time");
            }
        }
        catch (Exception e){
            System.out.println("Invalid time format!");
        }
    }
}
