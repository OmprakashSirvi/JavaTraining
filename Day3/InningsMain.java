package Day3;

import java.util.Scanner;

public class InningsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teamName, inningsName;
        int runs;
        System.out.println("Enter team name");
        teamName = sc.nextLine();
        System.out.println("Enter innings");
        inningsName = sc.nextLine();
        System.out.println("Enter runs");
        runs = sc.nextInt();

        Innings inn1 = new Innings(teamName, inningsName, runs);
        inn1.displayInningsDetail();

        sc.close();
    }
}
