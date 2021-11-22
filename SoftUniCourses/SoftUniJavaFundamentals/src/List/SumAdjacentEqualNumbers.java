package List;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split =scanner.nextLine().split(" ");

        List<Double> numburs = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            double num = parseDouble(split[i]);

            numburs.add(num);
        }
        //3 3 6 1
        for (int i = 0; i < numburs.size() - 1; i++) {

            if (numburs.get(i).equals(numburs.get(i + 1))) {

                double sum = numburs.get(i) * 2;
                numburs.remove(i);//3 6 1
                numburs.set(i, sum);// 6 6 1
                i = -1;

            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for ( Double number : numburs) {
            System.out.print(decimalFormat.format(number) + " ");

        }

    }
}
