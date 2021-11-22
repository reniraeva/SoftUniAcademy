package SubmitSolution;
import java.util.*;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
    //    int[] lifts = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

       List<Integer> lists = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            lists.add(Integer.parseInt(input[i]));

        }

        for (int i = 0; i < lists.size(); i++) {
            int insidePeople = lists.get(i);
            int freeSpace = 4 - insidePeople;

            if (freeSpace >= 4) {
                continue;
            }

            if (freeSpace >= people) {
                lists = Collections.singletonList(lists.get(i) + people);
                people=0;
                break;

            }

            lists = Collections.singletonList(4);
            people=people-freeSpace;

        }
        if (people == 0) {
            System.out.println("The lifts has empty spots!");
            for (int lift: lists) {
                System.out.print(lift +" ");

            }
        }else {
            System.out.printf("There isn't enough space! people %d in a queue!%n",people);

            for (int lift: lists) {
                System.out.print(lift + " ");
            }
        }

    }
}

