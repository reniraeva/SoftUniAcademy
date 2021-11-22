package ExerciseMapsLambdaStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int index = 0; index < text.length();index++) {
            char symboll = text.charAt(index);
            if (symboll == ' '){
                continue;
                //ако е празен преск. логиката и се качва горе и добавя ++
            }
            //проверка срещала синв. или не-
            //ако  сме
            if (count.containsKey(symboll)){
                count.put(symboll,count.get(symboll) + 1);
            } else {//ako ne sme
                count.put(symboll,1);
            }

        }

        count.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
