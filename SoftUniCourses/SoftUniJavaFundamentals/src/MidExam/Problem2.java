package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int blacklist = 0;
        int lost = 0;
        while (true){
            String [] commands = scanner.nextLine().split(" ");
            if (commands[0].equals("Report")){
                System.out.println("Blacklisted names: " + blacklist);
                System.out.println("Lost names: " + lost);
                System.out.println(String.join(" ", friends));
                break;
            }
            switch (commands[0]){
                case "Blacklist":
                    String name = commands[1];
                    if (friends.indexOf(name) != -1){
                        int index = friends.indexOf(name);
                        friends.set(index, "Blacklisted");
                        blacklist++;
                        System.out.printf("%s was blacklisted.%n",name);
                    }else {
                        System.out.printf("%s was not found.%n",name);
                    }
                    break;
                case "Error":
                    int indexError = Integer.parseInt(commands[1]);
                    if (indexError >= 0 && indexError < friends.size()){
                        String element = friends.get(indexError);
                        if (!element.equals("Blacklisted") && !element.equals("Lost")){
                            friends.set(indexError, "Lost");
                            System.out.printf("%s was lost due to an error.%n",element);
                            lost++;
                        }
                    }
                    break;
                case "Change":
                    int indexChange = Integer.parseInt(commands[1]);
                    String nameChange = commands[2];
                    if (indexChange >= 0 && indexChange < friends.size()) {
                        String oldName = friends.get(indexChange);
                        friends.set(indexChange,nameChange);
                        System.out.println(oldName + " changed his username to " + nameChange + ".");
                    }
                    break;
            }
        }
    }
}