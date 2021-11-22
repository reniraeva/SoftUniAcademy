package firststep;

import java.util.Scanner;

public class BirdayParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //buget?= zala+ animator+torta+ napitki
        //Торта – цената ѝ е 20% от наема на залата
        // Напитки – цената им е 45% по-малко от тази на тортата
        // Аниматор – цената му е 1/3 от цената за наема на залата
        //наем за залата: 2250
        // цена за тортата: 2250 * 20% = 450
        //цена за напитки: 450 – 45% = 247.5
        //цена за аниматор: 1 / 3 от 2250 = 750
        //необходима сума: 2250 + 450 + 247.5 +750 = 3697.5

        int hallPrice = Integer.parseInt(scanner.nextLine());
        double animator = hallPrice / 3.0;
        double cake = hallPrice * 0.2;
        double drinks = cake - 0.45 * cake;
        double totalB = hallPrice + animator + cake + drinks;

        System.out.println(totalB);

    }

}
