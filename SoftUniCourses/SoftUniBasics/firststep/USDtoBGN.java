package firststep;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        double USD = Double.parseDouble(text);
        double BGN = USD * 1.79549;
        System.out.println(BGN);




    }
}