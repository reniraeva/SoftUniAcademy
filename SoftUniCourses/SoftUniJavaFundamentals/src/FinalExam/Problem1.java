package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String[] command =scanner.nextLine().split(" ");


        while (!command[0].equals("Complete")){

            switch (command[0]){

//o	" Rep{char}"
                case "Make":
                    if (command[1].equals("Upper")) {
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(command[1]);
                    int index = email.length()-count;
                    String domain = email.substring(index);
                    System.out.println(domain);
                    break;
                case "GetUsername":
                    if (email.contains("@")) {
                        String userName = email.split("@")[0];
                        System.out.println(userName);
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol.%n",email);
                    }
                    break;
                case "Replace":

                    email = email.replaceAll(command[1], "-");
                    System.out.println(email);
                    break;
                case "Encrypt":

                    String[] chars = email.split("");
                    for (int i = 0; i < chars.length; i++) {

                        String current = chars[i];
                        if (i < chars.length-1) {
                            System.out.print(((int) current.charAt(0) + " "));
                        } else {
                            System.out.print(((int) current.charAt(0)));
                        }

                    }

                    break;

            }


            command = scanner.nextLine().split(" ");
        }


    }
}
