package whileloops;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width =Integer.parseInt(scanner.nextLine());
        int length =Integer.parseInt(scanner.nextLine());

        int countPieces = width * length;//лице на торта-общо пар1етата

        String command = scanner.nextLine();
        while (!command.equals("STOP")){
            int takePieces = Integer.parseInt(command);
            countPieces -= takePieces;
            if (countPieces < 0){
                System.out.printf("No more cake left! You need %d pieces more", Math.abs(countPieces));
                break;
            }
          command = scanner.nextLine();

        }                           //край w
         if (command.equals("STOP")){
             System.out.printf("%d pieces are left.", countPieces);
         }

    }
}
