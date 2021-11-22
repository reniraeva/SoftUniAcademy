package testTT1;

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int humanYears =Integer.parseInt(input);
        int dogYars = 0;

        if (humanYears<= 2){
            dogYars = humanYears * 10;

        }else {
            dogYars = 20 +(humanYears - 2) * 4;

        }
        System.out.println(dogYars);
    }
}
