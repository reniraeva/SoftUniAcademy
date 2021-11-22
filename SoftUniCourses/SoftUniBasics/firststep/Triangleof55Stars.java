package firststep;

public class Triangleof55Stars {
    public static void main(String[] args) {

//        String[] stars ={"*", "**", "***", "****","*****", "******", "*******", "********","*********", "***********"};
        //for (String i : stars) {
        for (int i = 1; i <= 10; i++) {

            for (int y = 1; y <= i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
