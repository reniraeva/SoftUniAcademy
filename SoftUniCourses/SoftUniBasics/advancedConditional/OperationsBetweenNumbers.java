package advancedConditional;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //N1 – цяло число в интервала [0...40 000]
        //N2 – цяло число в интервала [0...40 000]
        //Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“
          int N1 = Integer.parseInt(scanner.nextLine());
          int N2 = Integer.parseInt(scanner.nextLine());
          String operator = scanner.nextLine();

          int result = 0;
          double result2 = 0;
          String evenOdd = "even";

          switch (operator){
              case "+":
                  result = N1 + N2;
                  if(result % 2 != 0){
                      evenOdd = "odd";
                  }
               System.out.printf("%d + %d = %d - %s", N1, N2, result, evenOdd );
                  break;
              case "-":
                  result = N1 - N2;
                  if(result % 2 != 0){
                  evenOdd = "odd";
              }
                  System.out.printf("%d - %d = %d - %s", N1, N2, result, evenOdd );
                  break;
              case "*":
                  result = N1 * N2;
                  if(result % 2 != 0){
                      evenOdd = "odd";
                  }
                  System.out.printf("%d * %d = %d - %s", N1, N2, result, evenOdd );
                  break;

              case "/":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero",N1);
                } else {
                    result2 = N1 *1.0 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, result2);
                }
                  break;

              case "%":
                  if (N2 == 0){
                      System.out.printf("Cannot divide %d by zero",N1);
                  } else{
                      result = N1 % N2;
                      System.out.printf("%d %% %d = %d", N1, N2, result );

                  }

                  break;
          }

    }
}
//Изход//Да се отпечата на конзолата един ред:
//Ако операцията е събиране, изваждене или умножение:„{N1} {оператор} {N2} = {резултат} – {even/odd}“
//Ако операцията е деление:„{N1} / {N2} = {резултат}“ – резултатът е фораматиран до вторият знак след дес.запетая
//Ако операцията е модулно деление: „{N1} % {N2} = {остатък}“
//В случай на деление с 0(нула):„Cannot divide {N1} by zero“
