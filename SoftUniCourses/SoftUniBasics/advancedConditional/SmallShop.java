package advancedConditional;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

       // double[] prices = new double[]{0.4, 0.45, 0.5};

        switch (product){
            case "coffee":
                if (city.equals("Varna")) {
                    System.out.println(quantity * 0.45);
                } else if (city.equals("Plovdiv")){
                    System.out.println(quantity * 0.40);
                } else if (city.equals("Sofia")){
                    System.out.println(quantity * 0.50);
                }

                break;
            case "water":
                if (city.equals("Varna")){
                    System.out.println(quantity * 0.70);
                } else if (city.equals("Plovdiv")){
                    System.out.println(quantity * 0.70);
                } else if (city.equals("Sofia")){
                    System.out.println(quantity * 0.80);
                }
                break;
            case "beer":
                if (city.equals("Varna")){
                    System.out.println(quantity * 1.10);
                } else if (city.equals("Plovdiv")){
                    System.out.println(quantity * 1.15);
                } else if (city.equals("Sofia")){
                    System.out.println(quantity * 1.20);
                }
                break;
            case "sweets":
                if (city.equals("Varna")){
                    System.out.println(quantity * 1.35);
                } else if (city.equals("Plovdiv")){
                    System.out.println(quantity * 1.30);
                } else if (city.equals("Sofia")){
                    System.out.println(quantity * 1.45);
                }
                break;
            case "peanuts":
                if (city.equals("Varna")){
                    System.out.println(quantity * 1.55);
                } else if (city.equals("Plovdiv")){
                    System.out.println(quantity * 1.50);
                } else if (city.equals("Sofia")){
                    System.out.println(quantity * 1.60);
                }
                break;


        }

    }
}
