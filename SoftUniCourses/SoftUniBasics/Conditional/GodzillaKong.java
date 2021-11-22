package Conditional;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

          double bugetFilm = Double.parseDouble(scanner.nextLine());
          double statist = Double.parseDouble(scanner.nextLine());
          double praisClothes = Double.parseDouble(scanner.nextLine());
          double dekor = bugetFilm * 0.10;
          double clothes = statist * praisClothes;
          if (statist > 150){
              clothes = clothes - (clothes * 0.10);
          }
          double totalBudget = dekor + clothes;
          double ostatuk = bugetFilm - totalBudget;

        if (totalBudget <= bugetFilm){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", ostatuk);

        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(ostatuk));
        }
    }
}
