package List;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String curent = scanner.nextLine();

            products.add(curent);

        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1)+"."+products.get(i));

        }


    }
}
