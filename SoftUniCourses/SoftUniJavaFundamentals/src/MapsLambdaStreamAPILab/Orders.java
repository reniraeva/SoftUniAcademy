package MapsLambdaStreamAPILab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , Integer> quantitMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")){

            String[]token = input.split("\\s+");
            String product = token[0];
            double price = Double.parseDouble(token[1]);
            int quantity = Integer.parseInt(token[2]);


             priceMap.put(product,price);
             quantitMap.putIfAbsent(product,0);
            int newQuantity = quantitMap.get(product)+quantity;
            quantitMap.put(product,newQuantity);

            input= scanner.nextLine();

        }
        quantitMap.forEach((k,v) -> System.out.println(String.format("%s -> %.2f",k,v * priceMap.get(k))));

    }
}
