package ExercisesObjectsAndClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articaleDate = scanner.nextLine();
        String[] splitDate = articaleDate.split(", ");////"{title}, {content}, {author}"

        String title = splitDate[0];
        String content = splitDate[1];
        String author = splitDate[2];

        Articles articles = new Articles(title, content,author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String comand = scanner.nextLine();
            String comandName = comand.split(": ")[0];
            String comandParameter = comand.split(": ")[1];

            switch (comandName){
                case "Edit":
                    articles.edit(comandParameter);
                    break;
                case "ChangeAuthor":
                    articles.chageAuthor(comandParameter);
                    break;
                case "Rename" :
                    articles.rename(comandParameter);
                    break;
            }

        }

        System.out.println(articles.toString());




    }
}

