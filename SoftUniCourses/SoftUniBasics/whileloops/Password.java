package whileloops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String current="";

          // while (!current.equals(password)){
          //  current=scanner.nextLine();
        //}

        while (true){
            if(current.equals(password)){
                break;
            }
            current=scanner.nextLine();

        }

        System.out.printf("Welcome %s!", userName);
    }
}
