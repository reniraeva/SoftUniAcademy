package MethodsLab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width =Integer.parseInt(scanner.nextLine());
        int heidth =Integer.parseInt(scanner.nextLine());

        int area = calculateArea(width,heidth);

        System.out.println(area);
    }

    private static int calculateArea(int a, int b) {
        return a * b;
    }


}
