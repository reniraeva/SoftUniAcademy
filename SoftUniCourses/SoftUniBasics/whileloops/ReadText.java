//package whileloops;
//
//import java.util.Scanner;
//
//public class ReadText {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//         String name = "";
//
//         while (!name.equals("Stop")){
//             System.out.println(name);
//             name = scanner.nextLine();
//         }
//    }
//}
package whileloops;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String name = "";

         while (true){
             name = scanner.nextLine();
             if (name.equals("Stop")){
                 break;
             }

             System.out.println(name);
         }
    }
}