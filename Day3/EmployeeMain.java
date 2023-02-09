package Day3;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, address, mobile;
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter address");
        address = sc.nextLine();

        System.out.println("Enter mobile");
        mobile = sc.nextLine();

        Employee emp1 = new Employee(name, address, mobile);
        System.out.println(emp1);
        int index = 0;

        while (index != 4) {
            System.out.println("\n\nVerify and Update Details");
            System.out.println("Menu");
            System.out.println("1: Update employee name : ");
            System.out.println("2: Update employee address : ");
            System.out.println("3: Update employee mobile : ");
            System.out.println("4: All information is correct : ");
            index = sc.nextInt();

            switch (index) {
                case 1:
                    System.out.println("Your current name is : " + emp1.getName());
                    name = sc.next();
                    emp1.setName(name);
                    System.out.println("\n\tYour updated information : \n" + emp1);
                    break;
                case 2:
                    System.out.println("Your current address is : " + emp1.getAddress());
                    address = sc.next();
                    emp1.setAddress(address);
                    System.out.println("\n\tYour updated information : \n" + emp1);
                    break;
                case 3:
                    System.out.println("Your current mobile is : " + emp1.getMobile());
                    mobile = sc.next();
                    emp1.setMobile(mobile);
                    System.out.println("\n\tYour updated information : \n" + emp1);
                    break;
                case 4:
                    System.out.println(emp1);
                    break;
                default:
                    System.out.println("Thanks for using me!!");
                    sc.close();
                    return;
            }
        }

        sc.close();
    }
}
