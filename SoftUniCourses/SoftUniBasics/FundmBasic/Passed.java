package FundmBasic;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade =Double.parseDouble(scanner.nextLine());


        if (3.00 <= grade){
            System.out.printf("Passed!");
        }else {
            System.out.printf("");
        }
    }
}
