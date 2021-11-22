package nestedloops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        //i1+j2+k3=n

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int sum = i + j + k;
                    if (sum == n){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
