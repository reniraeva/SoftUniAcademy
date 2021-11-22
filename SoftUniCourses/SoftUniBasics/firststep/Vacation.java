package firststep;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       //Брой страници в текущата книга – цяло число в интервала [1…1000]
        //Страници, които може да прочита за 1 час – цяло число в интервала [1…1000]
        //Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]

       int pagesBook = Integer.parseInt(scanner.nextLine());
       int pagesTime = Integer.parseInt(scanner.nextLine());
       int day = Integer.parseInt(scanner.nextLine());
       // изчисляваме общото време за четене на книгата: 212 / 20 = 10 часа
        // получения резултат делим на броя дни, за да получим необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден

        int timeBook = pagesBook / pagesTime;
        int time = timeBook / day;

         System.out.println(time);

    }
}