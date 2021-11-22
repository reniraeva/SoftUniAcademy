package Conditional;

import java.util.Scanner;

public class PasswordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String pass = "s3cr3t!P@ssw0rd";

        if (password.equals(pass)){
            System.out.print("Welcome");
        }else {
            System.out.print("Wrong password!");
        }


    }
}
