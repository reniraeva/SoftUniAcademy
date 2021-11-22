package ExerciseLists;

import java.util.ArrayList;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> numbers = new ArrayList<>();
        String[] inputData = scanner.nextLine().split("\\s");

        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }

        ArrayList<Integer> bombNumber = new ArrayList<>();
        String[] inputDataTwo = scanner.nextLine().split("\\s");

        for (int i = 0; i < inputDataTwo.length; i++) {
            bombNumber.add(Integer.parseInt(inputDataTwo[i]));
        }

        int bombIndex = bombNumber.get(0);
        int damageSize = bombNumber.get(1);
        int start = bombIndex - damageSize;
        int end = bombIndex + damageSize;
        int check = damageSize * 2 + 1;
        int sum =0;
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) == bombIndex) {
                for (int j = 0; j < damageSize; j++) {
                    if (index < numbers.size()) {
                        numbers.remove(index + 1);
                    }
                }

                for (int j=0;j<damageSize;j++){
                    if (index>0){
                        numbers.remove(index-1);
                        index--;
                    }

                }

            }


        }

        for (int i = 0; i <numbers.size() ; i++) {
            numbers.remove(Integer.valueOf(bombIndex));
        }



        for (int p = 0; p <numbers.size() ; p++) {

            sum+=numbers.get(p);

        }


        System.out.println(sum);


    }
}