package ExerciseMapsLambdaStreamAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies =
                new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[]tokens = input.split(" -> ");
            String company = tokens[0];
            String employ = tokens[1];

            companies.putIfAbsent(company, new LinkedList<>());
            List<String> list = companies.get(company);

            if (!list.contains(employ)){
                list.add(employ);
               }
            input = scanner.nextLine();

        }
        companies
                .entrySet()
                .stream()
                .sorted((c1,c2) ->
                        c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(id -> System.out.println(String.format("-- %s",id)));
                });

    }
}
