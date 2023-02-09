package Day3;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            System.out.println("Invalid input");
            return;
        }
        int len = sc.nextInt(), sumEven = 0, sumOdd = 0;

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
                System.out.println("Invalid input");
                return;
            }
            if (arr[i] % 2 == 0)
                sumEven += arr[i];
            else
                sumOdd += arr[i];
        }

        System.out.println(sumEven > sumOdd ? sumEven : sumOdd);

        sc.close();

    }

}
