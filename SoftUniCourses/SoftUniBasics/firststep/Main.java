package firststep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = Integer.MAX_VALUE;
        String rezult = "";

        for (int i = 0; i < n ; i++) {
            String test = scanner.nextLine();
            int curantSum = 0;
            for (int j = 0; j < test.length() ; j++) {
                char ch = test.charAt(j);
                curantSum+= ch-96;
            }
            if (curantSum < sum){
                sum = curantSum;
                rezult = sum+" "+test;
            }
        }

        System.out.print(rezult);
    }
}
