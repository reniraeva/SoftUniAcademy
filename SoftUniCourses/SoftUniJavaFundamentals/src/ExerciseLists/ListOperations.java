package ExerciseLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String > numbers= readStingList(scanner);

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String [] tokens= input.split("\\s+");
            String comand= tokens[0];

              switch (comand){
                  case "Add":
                      String elementToAdd = tokens[1];
                      numbers.add(elementToAdd);
                      break;

                  case "Insert": {
                      String number = tokens[1];
                      int index = Integer.parseInt(tokens[2]);
                      if (isValidindex(index, numbers)) {
                          numbers.add(index, number);
                      } else {
                          System.out.println("Invalid index");
                      }
                  }
                      break;

                  case "Remove": {
                      int index = Integer.parseInt(tokens[1]);
                      if (isValidindex(index,numbers)){
                          numbers.remove(index);
                      }else {
                          System.out.println("Invalid index");
                      }
                  }
                      break;
                  case "Shift":
                      int rotCnt = Integer.parseInt(tokens[2]);
                      if ("left".equals(tokens[1])){
                          for (int i = 0; i < rotCnt; i++) {
                              String temp = numbers.get(0);
                              for (int j = 0; j < numbers.size()-1; j++) {
                                  String nextElement = numbers.get(j+1);
                                  numbers.set(j,nextElement);

                              }
                              numbers.set(numbers.size()-1,temp);
                          }

                           } else {
                                for (int i = 0; i < rotCnt ; i++) {
                                    String temp = numbers.get(numbers.size()-1);
                                    for (int j = numbers.size()-1; j >0 ; j--) {
                                       String nextNum = numbers.get(j-1);
                                       numbers.set(j,nextNum);
                                    }
                                    numbers.set(0, temp);
                             }
                      }
                      break;
             }
            input= scanner.nextLine();

        }
        System.out.println(String.join(" ",numbers));
    }

    private static boolean isValidindex(int index, ArrayList<String> collection) {
        if (index >=0 && index < collection.size()){
            return true;
        } else {
            return false;
        }
    }

    private static ArrayList<String> readStingList(Scanner scanner) {
        ArrayList<String> output = new ArrayList<>();
        String[]input = scanner.nextLine().split("\\s+");
        for (String element:input) {
            output.add(element);

        }
        return output;
    }
}
