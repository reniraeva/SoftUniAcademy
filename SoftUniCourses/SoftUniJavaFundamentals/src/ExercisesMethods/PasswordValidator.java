package ExercisesMethods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  password = scanner.nextLine();

        boolean isValid = checkCharacters(password) && lettersOrDigits(password) && checkLength(password);
        if (isValid){
            System.out.println("Password is valid");
        }
    }

    private static boolean checkLength(String password) {
        boolean res = password.length() >= 2;
        if (!res){
            System.out.println("Password must have at least 2 digits");
        }
        return res;
    }

    private static boolean lettersOrDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if (!(Character.isDigit(current) || Character.isAlphabetic(current))){
                System.out.println("Password must consist only of letters and digits");
                return  false;
            }
        }
        return true;
    }

    private static boolean checkCharacters(String password) {
        boolean res = (password.length() >= 6 && password.length() <= 10);
        if (!res) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return res ;
    }
}
