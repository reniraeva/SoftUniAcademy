package whileloops;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //два варианта за стоп-стъпки >=10000 или команда ..
        //команда или число/бр.стъпки/
        int totalStep = 0;
        String commanda = scanner.nextLine();
        while (!commanda.equals("Going home")){

            int step = Integer.parseInt(commanda);
            totalStep += step;
            if (totalStep>= 10000){
                break;
            }

            commanda = scanner.nextLine();


        }
        if (commanda.equals("Going home")){
            int stepHome = Integer.parseInt(scanner.nextLine());
            totalStep += stepHome;
        }
        if (totalStep>= 10000){
            System.out.println("Goal reached! Good job!");
            int moreSteps = totalStep - 10000;
            System.out.printf("%d steps over the goal!", moreSteps);

        }else {
            int diff = 10000 - totalStep;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
