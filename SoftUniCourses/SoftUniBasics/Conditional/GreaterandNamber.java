package Conditional;

import java.util.Scanner;

public class GreaterandNamber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int fisrNumber = Integer.parseInt(scanner.nextLine());//5
       int secandNumber = Integer.parseInt(scanner.nextLine());//10

       if (fisrNumber>=secandNumber){
           System.out.println(fisrNumber);
       }else {
           System.out.println(secandNumber);
       }


    }

}
