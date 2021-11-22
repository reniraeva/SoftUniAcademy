package advancedConditional;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Първият ред съдържа час на изпита – цяло число от 0 до 23.
//Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.

        int hourEx = Integer.parseInt(scanner.nextLine());
        int minutEx = Integer.parseInt(scanner.nextLine());
        int hourAr = Integer.parseInt(scanner.nextLine());
        int minutAr = Integer.parseInt(scanner.nextLine());

        int examTimeMinut = hourEx * 60 + minutEx;
        int arTimeMinut = hourAr * 60 +minutAr;

      if (arTimeMinut > examTimeMinut){
          System.out.println("Late");
          //if ((arTimeMinut - examTimeMinut) < 60 ){
          // System.out.printf("%d minutes after the start",(arTimeMinut - examTimeMinut) );
         // } else{On time

          } else if(arTimeMinut == examTimeMinut || (examTimeMinut - arTimeMinut) <= 30 ){

          System.out.printf("On time");

      } else if((examTimeMinut - arTimeMinut) > 30){
          System.out.printf("Early");

      }



    }
}
