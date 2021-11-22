import java.util.Scanner;

public class Task2NumbersNotDivisibleby3and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){
            if (i%3!=0&&i%7!=0){
                System.out.print(i+" ");
            }
        }
    }
}
