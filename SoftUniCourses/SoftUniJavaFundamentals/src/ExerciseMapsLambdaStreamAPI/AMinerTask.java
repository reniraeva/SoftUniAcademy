package ExerciseMapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String resource;
        int quantity;

        Map<String, Integer> sum = new
                LinkedHashMap<>();

        while (true){
            resource = scanner.nextLine();

            if (resource.equals("stop")){
                break;
            }

            quantity = Integer.parseInt(scanner.nextLine());

            if (sum.containsKey(resource)){
                sum.put(resource,sum.get(resource) + quantity);
            } else {//ako ne sme
                sum.put(resource, quantity);
            }

        }

        sum.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
