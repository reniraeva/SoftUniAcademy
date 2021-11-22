package testTT1;

import java.util.Scanner;

public class mobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String termContract = scanner.nextLine();//"one", или "two"
        String tupeContract = scanner.nextLine();//"Small",  "Middle", "Large"или "ExtraLarge"
        String mobileInternet = scanner.nextLine();//текст – "yes" или "no
        int  numberOfMonths = Integer.parseInt(scanner.nextLine());

        double oneSmall = 9.98;
        double twoSmal = 8.58;
        double oneMiddle = 18.99;
        double twoMiddle = 17.09;
        double oneLarge = 25.98;
        double twoLarge = 23.59;
        double oneExtraLarge = 35.99;
        double twoExtraLarge = 31.79;

        double taks = 0;

        switch (tupeContract){
            case "Small":
                if (termContract.equals("one")){
                    taks = oneSmall;
                }else {
                    taks = twoSmal;
                }
                if (mobileInternet.equals("yes")){
                    if (taks <= 10){
                        taks += 5.50;
                    }else if (taks <= 30){
                        taks+= 4.35;
                    } else if (taks > 30 ){
                        taks+= 3.85;
                    }
                }

                taks = taks * numberOfMonths;

                if (termContract.equals("two")){
                    taks = taks -(taks * (3.75/100));
                }
                break;

            case "Middle":
                if (termContract.equals("one")){
                    taks = oneMiddle;
                }else {
                    taks = twoMiddle;
                }
                if (mobileInternet.equals("yes")){
                    if (taks <= 10){
                        taks += 5.50;
                    }else if (taks <= 30){
                        taks+= 4.35;
                    } else if (taks > 30 ){
                        taks+= 3.85;
                    }
                }

                taks = taks * numberOfMonths;

                if (termContract.equals("two")){
                    taks = taks -(taks * (3.75/100));
                }
                break;

            case "Large":
                if (termContract.equals("one")){
                    taks = oneLarge;
                }else {
                    taks = twoLarge;
                }
                if (mobileInternet.equals("yes")){
                    if (taks <= 10){
                        taks += 5.50;
                    }else if (taks <= 30){
                        taks+= 4.35;
                    } else if (taks > 30 ){
                        taks+= 3.85;
                    }
                }
                taks = taks * numberOfMonths;

                if (termContract.equals("two")){
                    taks = taks -(taks * (3.75/100));
                }
                break;

            case "ExtraLarge":
                if (termContract.equals("one")){
                    taks = oneExtraLarge;
                }else {
                    taks = twoExtraLarge;
                }
                if (mobileInternet.equals("yes")){
                    if (taks <= 10){
                        taks += 5.50;
                    }else if (taks <= 30){
                        taks+= 4.35;
                    } else if (taks > 30 ){
                        taks+= 3.85;
                    }
                }
                taks = taks * numberOfMonths;

                if (termContract.equals("two")){
                    taks = taks -(taks * (3.75/100));
                }
                break;
        }

        System.out.printf("%.2f lv.", taks);
    }
}
