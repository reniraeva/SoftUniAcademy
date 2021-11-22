package ObjectsAndClassesLab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int f = Integer.parseInt(scanner.nextLine());

        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= f ; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));

        }
        System.out.println(bigInteger);
    }
}
