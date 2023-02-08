import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int salary = sc.nextInt();
            if (salary > 8000) {
                System.out.println("Salary too high");
                sc.close();
                return;
            } else if (salary < 0) {
                System.out.println("Salary is too low");
                sc.close();
                return;
            }
            int shifts = sc.nextInt();
            if (shifts < 0) {
                System.out.println("Shifts are too small");
                sc.close();
                return;
            }
            double index = 0.5 - (0.02 * shifts);

            salary -= index * salary;

            System.out.println("Your remaining salary is " + salary);

            sc.close();

        }

    }
}