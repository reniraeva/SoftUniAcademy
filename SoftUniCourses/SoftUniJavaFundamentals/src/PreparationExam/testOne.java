package PreparationExam;

import java.util.*;

public class testOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> likeMeals = new HashMap<>();

        int unliked = 0;
        while (!line.equals("Stop")){

            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String menuName = split[2];

            if (type.equals("Like")){

                likeMeals.putIfAbsent(guestName,new ArrayList<>());
                List<String> guestMeals = likeMeals.get(guestName);

                if (!guestMeals.contains(menuName)){
                    guestMeals.add(menuName);

                }
                likeMeals.put(guestName,guestMeals);

            }else {
                if (!likeMeals.containsKey(guestName)){
                    System.out.printf("%s is not at the party %n", guestName);
                }else {
                    List<String> meals = likeMeals.get(guestName);
                    if (!meals.contains(menuName)) {

                        System.out.printf("%s doesn't have the %s his/her collection.%n", guestName,menuName);
                    }else {
                        unliked++;
                        System.out.printf("%s doesn't like the %s.%n",guestName,menuName);
                        meals.remove(menuName);
                        likeMeals.put(guestName,meals);

                    }
                }
            }

            line = scanner.nextLine();
        }

    }
}
