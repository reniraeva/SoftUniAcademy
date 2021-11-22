package firststep;

import java.util.Scanner;

public class ExcellentonResult {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int numbur = Integer.parseInt(scanner.nextLine());
        if (numbur >= 5) {
            System.out.println("Excellent!");

        }else {

            System.out.println("Not Excellent !");
        }
        System.out.println("bye");
    }

}

