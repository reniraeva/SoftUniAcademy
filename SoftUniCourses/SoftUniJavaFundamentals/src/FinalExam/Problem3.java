package FinalExam;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , List<String>> words = new HashMap<>();
        String[] firstLine = scanner.nextLine().split("\\|");
        String[] secondLine = scanner.nextLine().split("\\|");
        String commands = scanner.nextLine();

        for (int i = 0; i < firstLine.length; i++) {
//programmer: an animal, which turns coffee into code
// developer: a magician
            String[] line = firstLine[i].split(":");
            String  word = line[0].trim();
            String  description = line[1].trim();

            if (!words.containsKey(word)){
                ArrayList<String> list = new ArrayList<>();
                list.add(description);
                words.put(word, list);
            }else {
                words.get(word).add(description);
            }
        }

        if (commands.equals("Hand Over")){

            words.keySet().stream().sorted().forEach(k -> System.out.print(k +" "));

        }else {

            for (int i = 0; i < secondLine.length; i++) {

                for (var word:words.entrySet()) {

                    if (secondLine[i].trim().equals(word.getKey())){
                        System.out.printf("%s:%n", word.getKey());
                        word.getValue().stream().sorted((n1,n2) -> n2.length() - n1.length()).forEach((k)-> System.out.printf(" -%s%n",k));

                    }
                }

            }

        }

    }
}
