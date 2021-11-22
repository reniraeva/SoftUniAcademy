import javax.swing.*;
import java.util.Scanner;

public class Task4SmallerGreaterOrEqual {
    public static void main(String[] args) {
        System.out.println("How many numbers: ");
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int current = Integer.parseInt(sc.nextLine());
        int value = 0;
        String str = "" + current;
        for (int i = 2; i <= numbers; i++) {
            value = Integer.parseInt(sc.nextLine());
            str += (value > current ? "<" : value < current ? ">" : "=") + value;
            current = value;
        }
        System.out.println(str);
    }
}
