import java.util.Scanner;

public class Task1numsFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i=1;i<=num;i++){
            System.out.print(i+" ");
        }

    }
}
