package advancedConditional;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //  String test = name.equals("banana") || name.equals("apple") ? "fruit" : "unknown";
        //System.out.println(test);
        if (name.equals("banana") ||
                name.equals("apple") ||
                name.equals("kiwi") ||
                name.equals("cherry") ||
                name.equals("lemon") ||
                name.equals("grapes")) {
            System.out.println("fruit");
        } else if (name.equals("tomato") ||
                name.equals("cucumber") ||
                name.equals("pepper") ||
                name.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}

//        switch (name){
//            case "banana":
//            case "apple":
//            case "kiwi":
//            case "cherry":
//            case "lemon":
//            case "grapes":
//                System.out.println("fruit");
//                break;
//            case "tomato":
//            case "cucumber":
//            case "pepper":
//            case "carrot":
//              System.out.println("vegetable");
//                break;
//            default: System.out.println("unknown");
//                break;

//        }



