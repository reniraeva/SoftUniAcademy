package telerikacademy;

import java.util.Scanner;
//Write a program that applies bonus score to given score in the range [1…9] by the following rules:
// * If the score is between 1 and 3, the program multiplies it by 10. * If the score is between 4 and 6,
// the program multiplies it by 100. * If the score is between 7 and 9, the program multiplies it by 1000.
// * If the score is 0 or more than 9, the program prints “invalid score”.

public class BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score >= 1 && score <= 3){
            score = score*10;
            System.out.println(score);
        }else if(score >= 4 && score <= 6){
            score = score*100;
            System.out.println(score);
        }else if(score >= 7 && score <= 9){
            score = score*1000;
            System.out.println(score);
        }else{
            System.out.println("invalid score");
        }
    }
}
