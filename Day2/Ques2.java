import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num > 1) {
            if (num % 2 == 1) {
                System.out.println("Not a power of two");
                sc.close();
                return;
            }
            num /= 2;
        }

        System.out.println("Power of two");
        sc.close();
    }
}
