package StartTA2;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int score =Integer.parseInt(scanner.nextLine());
        int bonusScore = 0;

         if (score >= 1 && score<=3){
             bonusScore = score *10;
             System.out.print(bonusScore);

         }else if (score >= 4 && score<=6){
             bonusScore = score *100;
             System.out.print(bonusScore);

         }else if(score >= 7 && score<=9){
             bonusScore = score *1000;
             System.out.print(bonusScore);

        }else if(score <= 0 || score >9){
             System.out.print("invalid score");
         }

    }
}
