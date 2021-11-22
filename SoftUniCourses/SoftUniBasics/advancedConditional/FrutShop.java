package advancedConditional;

import java.util.Scanner;

public class FrutShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();;
        String nameDay = scanner.nextLine();;
        double amount = Double.parseDouble(scanner.nextLine());
        switch (product){
            case "banana":
                if (nameDay.equals("Monday")||
                    nameDay.equals("Tuesday")||
                    nameDay.equals("Wednesday")||
                    nameDay.equals("Thursday")||
                    nameDay.equals("Friday")){
                    System.out.printf("%.2f" , amount * 2.50);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 2.70);
                } else {
                    System.out.println("error");
                }
                break;
            case "apple":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f",amount * 1.20);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 1.25);
                } else {
                    System.out.println("error");
                }
                break;
            case "orange":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f",amount * 0.85);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 0.90);
                } else {
                    System.out.println("error");
                }
                break;
            case "grapefruit":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f",amount * 1.45);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 1.60);
                } else {
                    System.out.println("error");
                }
                break;
            case "kiwi":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f" ,amount * 2.70);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 3.00);
                } else {
                    System.out.println("error");
                }
                break;
            case "pineapple":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f",amount * 5.50);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf("%.2f",amount * 5.60);
                } else {
                    System.out.println("error");
                }
                break;
            case "grapes":
                if (nameDay.equals("Monday")||
                        nameDay.equals("Tuesday")||
                        nameDay.equals("Wednesday")||
                        nameDay.equals("Thursday")||
                        nameDay.equals("Friday")){
                    System.out.printf("%.2f" ,amount * 3.85);
                } else if(nameDay.equals("Saturday") || nameDay.equals("Sunday")){
                    System.out.printf( "%.2f", amount * 4.20);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}