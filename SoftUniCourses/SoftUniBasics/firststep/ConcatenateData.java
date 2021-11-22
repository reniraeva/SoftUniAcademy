package firststep;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."

      String firstName = scanner.nextLine();

      String lastName = scanner.nextLine();
      String age = scanner.nextLine();
      String town = scanner.nextLine();

        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from "+town+".");

        System.out.printf("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town);
    }
}
