package MapsLambdaStreamAPILab;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isObtained = false;
        while (!isObtained){

            String[] inputLine = scanner.nextLine().split("\\s+");
            for (int i = 0; i < inputLine.length; i+=2){
                //3 Motes 5 stones 5 Shards
                int quantity = Integer.parseInt(inputLine[i]);
                String item = inputLine[i+1].toLowerCase();
                if (keyMaterials.containsKey(item)){
                    addTooMap(keyMaterials,item,quantity);
                    isObtained = isObtained(keyMaterials,item);

                    if (isObtained) {
                        break;
                    }

                }else {
                    addTooMap(junk,item,quantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((i1,i2)->{int result = i2.getValue().compareTo(i1.getValue());
                if (result==0){
                    result= i1.getKey().compareTo(i2.getKey());
                }
                return result;

                })
                .forEach(i-> System.out.println(String.format("%s: %d",i.getKey(),i.getValue())));

        junk.entrySet()
                .stream()
                .sorted((i1,i2) -> i1.getKey().compareTo(i2.getKey()))
                .forEach(i-> System.out.println(String.format("%s: %d",i.getKey(),i.getValue())));
    }

    private static boolean isObtained(Map<String, Integer> map, String item) {
        if (map.get(item) >= 250){
            int newQuntity = map.get(item)-250;
            map.put(item,newQuntity);

            switch (item){
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
             return true;
        }
        return false;
    }
    private static void addTooMap(Map<String, Integer> map, String item, int quantity) {
        map.putIfAbsent(item,0);
        int newQuntity = map.get(item ) + quantity;
        map.put(item,newQuntity);
    }
}

