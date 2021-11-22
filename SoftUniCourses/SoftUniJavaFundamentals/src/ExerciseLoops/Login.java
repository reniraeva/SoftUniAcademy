package ExerciseLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        boolean isLogeed = false;
        for (int i = username.length() - 1; i >= 0; i--) {
            password = password + username.charAt(i);
        }

//        StringBuilder pass = new StringBuilder(username);
//        password = pass.reverse().toString();

        for (int i = 0; i < 4; i++) {
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(password)) {
                isLogeed = true;
                System.out.printf("User %s logged in.", username);
                break;
            }
            if (i < 3) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogeed) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
