package List;

import java.util.*;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] furst =scanner.nextLine().split(" ");
        String[] second =scanner.nextLine().split(" ");

        List<String> inputFurst = new ArrayList<>();
        List<String> inputSecond = new ArrayList<>();
        List<String> result = new ArrayList<>();

        inputFurst.addAll(Arrays.asList(furst));

        inputSecond.addAll(Arrays.asList(second));

        if (inputFurst.equals(inputSecond)) {

            for (int i = 0; i < inputFurst.size(); i++) {
                result.add(inputFurst.get(i));
                result.add(inputSecond.get(i));
            }

        } else if (inputFurst.size() > inputSecond.size()){

            for (int i = 0; i < inputSecond.size(); i++) {
                result.add(inputFurst.get(i));
                result.add(inputSecond.get(i));
            }

            for (int h = inputSecond.size(); h < inputFurst.size(); h++) {
                result.add(inputFurst.get(h));
            }

        } else {

            for (int i = 0; i < inputFurst.size(); i++) {
                result.add(inputFurst.get(i));
                result.add(inputSecond.get(i));
            }

            for (int h = inputFurst.size(); h < inputSecond.size(); h++) {
                result.add(inputSecond.get(h));
            }
        }

        // print
        for (String num: result) {
            System.out.print(num + " ");
        }

    }
}
