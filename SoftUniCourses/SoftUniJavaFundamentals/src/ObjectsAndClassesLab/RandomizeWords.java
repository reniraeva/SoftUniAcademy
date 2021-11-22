package ObjectsAndClassesLab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Random random = new Random();

        while (words.size()>0){
            String word = words.remove(random.nextInt(words.size()));
            System.out.println(word);

        }
    }
}
