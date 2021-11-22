import java.util.Scanner;

public class Task6WordOrNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a string: ");
        String str = sc.nextLine();
        int size = str.length();
        String reverse = new StringBuilder(str).reverse().toString();
        int i = 0;
        if (i!=size){
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                double num = Double.parseDouble(str);
                System.out.println(num+1);
            }
            else  {
                System.out.println(reverse);
            }
        }
    }
}

