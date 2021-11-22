package whileloops;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double resto = Double.parseDouble(scanner.nextLine());
       int coins = 0;

       while (resto > 0){
          if (resto >= 2){
              resto = Math.round((resto - 2.0) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 1){
              resto = Math.round((resto - 1.0) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.5){
              resto = Math.round((resto - 0.5) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.2){
              resto = Math.round((resto - 0.2) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.1){
              resto = Math.round((resto - 0.1) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.05){
              resto = Math.round((resto - 0.05) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.02){
              resto = Math.round((resto - 0.02) * 100.0) / 100.0;
              coins++;
          }else if (resto >= 0.01){
              resto = Math.round((resto - 0.01) * 100.0) / 100.0;
              coins++;
          }

       }

        System.out.println(coins);

    }
}
