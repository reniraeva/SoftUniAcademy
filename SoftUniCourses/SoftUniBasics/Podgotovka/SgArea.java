package Podgotovka;

import java.util.Scanner;

public class SgArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = Integer.parseInt(scanner.nextLine());
        int area = side * side;
        System.out.printf("a= %d%nSquare = %d",side,area);
    }
}
