package Day4;

import java.util.Scanner;

public class MatchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Match format");
        System.out.println("1: ODI match");
        System.out.println("2: T20 match");
        System.out.println("3: Test match");

        int index = sc.nextInt();

        System.out.println("Enter Current score");
        int currentScore = sc.nextInt();
        System.out.println("Enter Current over");
        float currentOver = sc.nextFloat();
        System.out.println("Enter Target score");
        int target = sc.nextInt();

        switch (index) {
            case 1:
                ODIMatch od1 = new ODIMatch(currentScore, target, currentOver, target);
                od1.display();
                break;
            case 2:
                T20Match t1 = new T20Match(currentScore, target, currentOver, target);
                t1.display();
                break;
            case 3:
                TestMatch ts1 = new TestMatch(currentScore, target, currentOver, target);
                ts1.display();
                break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
