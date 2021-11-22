package firststep;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);

        int dulgina = Integer.parseInt(scaner.nextLine());
        int shirina = Integer.parseInt(scaner.nextLine());
        int visochina = Integer.parseInt(scaner.nextLine());
        double protsent = Double.parseDouble(scaner.nextLine());

        double obem = dulgina * shirina * visochina * 0.001;
        double litri = obem * (1 - protsent/100);

        System.out.printf("%.2f", litri);




    }




}
