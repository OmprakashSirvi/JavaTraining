package Day3;

import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        String inp = sc.nextLine();

        String[] arr = inp.split(",");

        if (arr.length < 3) {
            System.out.println("Invalid Input ...");
            sc.close();
            return;
        }

        Customer cus = new Customer(arr[0], arr[1], arr[2]);

        System.out.println(cus);

        sc.close();
    }
}
