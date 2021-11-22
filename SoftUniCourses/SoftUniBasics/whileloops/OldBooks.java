package whileloops;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.четем вход;2.цикълн с правилната книга;
        //2.1..проверка дали книгата е в дибл/вутрев цикъла.;3. притираме
        String favoriteBook = scanner.nextLine();
        String commanda = scanner.nextLine();
        int bookCount = 0;

        while (!commanda.equals("No More Books")){

            if (commanda.equals(favoriteBook) ){
                System.out.printf("You checked %d books and found it.",bookCount);
                break;
            }else {
                bookCount++;

            }
              commanda = scanner.nextLine();
        }
        if (commanda.equals("No More Books")){
            System.out.printf("The book you search is not here!%n" + "You checked %d books." ,bookCount);

        }

    }
}
