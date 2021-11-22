package firststep;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        String name =  text.nextLine();

        System.out.printf("Hello, %s!", name);
        System.out.println("");
    }
}
