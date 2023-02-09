package Day3;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name : ");
        String name = sc.nextLine();
        System.out.println("Enter the employees : ");
        String employees = sc.nextLine();
        System.out.println("Enter team lead");
        String team_lead = sc.nextLine();
        if (!employees.contains(team_lead)) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        Company com = new Company(name, employees, team_lead);
        System.out.println(com);

        sc.close();
    }
}
