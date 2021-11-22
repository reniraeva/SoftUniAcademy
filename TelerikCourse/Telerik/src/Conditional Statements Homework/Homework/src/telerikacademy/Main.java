package telerikacademy;

import java.util.Scanner;
//Write an if-statement that takes two double variables a and b and exchanges their values if
// the first one is greater than the second one. As a result print the values a and b, separated by a space.
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double numberOne = scanner.nextDouble();
	double numberTwo = scanner.nextDouble();

	if(numberOne > numberTwo){
        System.out.println(numberOne + " " + numberTwo);
    }else if(numberTwo > numberOne){
        System.out.println(numberTwo + " " + numberOne);
    }else {
        System.out.println("They are equal");
    }
    }
}
