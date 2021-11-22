import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {
            String password = scanner.nextLine();

            boolean isValid = true;
            String[] firstSymbols = password.split(">");
            String[] lastSymbols = password.split("<");
            int indexMoreThan = password.indexOf(">");
            int indexLessThan = password.lastIndexOf("<");

            if (indexMoreThan > indexLessThan) {
                System.out.println("Try another password!");
                isValid = false;
                continue;
            }

            String[] middleSide = password.substring(indexMoreThan + 1, indexLessThan).split("\\|");

            if (middleSide.length < 4){
                System.out.println("Try another password!");
                continue;
            }

            if (firstSymbols[0].length() != lastSymbols[lastSymbols.length-1].length()){
                System.out.println("Try another password!");
                continue;
            }

            boolean isCharValid = true;
            for (int j = 0; j < middleSide.length; j++) {
                String cur = middleSide[j];
                if (cur.length()<3){
                    System.out.println("Try another password!");
                }

                for (int k = 0; k < cur.length(); k++) {
                    char ch = cur.charAt(k);
                    if (j==0 && !Character.isDigit(ch)){
                        System.out.println("Try another password!");
                        isCharValid = false;
                        break;
                    }

                    if (j == 1 && !Character.isLowerCase(ch)){
                        System.out.println("Try another password!");
                        isCharValid = false;
                        break;
                    }

                    if (j == 2 && !Character.isUpperCase(ch)){
                        System.out.println("Try another password!");
                        isCharValid = false;
                        break;
                    }

                }

                if (!isCharValid){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                System.out.print("Password: ");

                for (int j = 0; j < 4; j++) {
                    System.out.print(middleSide[j]);
                }
                System.out.println();

            }

        }


    }
}
