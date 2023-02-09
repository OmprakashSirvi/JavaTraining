package Day3;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            System.out.println("Invalid input");
            return;
        }
        int len = sc.nextInt();
        if (len % 2 != 0) {
            System.out.println("Lenght must be even");
            sc.close();
            return;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (!sc.hasNextInt()) {
                sc.close();
                System.out.println("Invalid input");
                return;
            }
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                sc.close();
                return;
            }
        }
        if (!sc.hasNextInt()) {
            sc.close();
            System.out.println("Invalid input");
            return;
        }
        int cutOff = sc.nextInt();
        for (int i = 1; i < len; i += 2) {
            if (arr[i] > cutOff)
                System.out.println(arr[i - 1]);
        }

        sc.close();
    }
}
