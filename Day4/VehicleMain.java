package Day4;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 : Two wheeler");
        System.out.println("2: Four Wheeler");
        int index = sc.nextInt();

        System.out.println("Vehicle make : ");
        String make = sc.next();

        System.out.println("Vehicle number : ");
        String vehicleNumber = sc.nextLine();

        System.out.println("Fuel type : ");
        String fuelType = sc.nextLine();

        System.out.println("Fuel capacity : ");
        int fuelCapacity = sc.nextInt();

        System.out.println("Engine CC : ");
        int engine = sc.nextInt();

        if (index == 1) {
            System.out.println("Kick start available?(Yes/no)");
            String bool = sc.next();
            boolean kickStart;
            if (bool.equals("yes"))
                kickStart = true;

            else
                kickStart = false;

            TwoWheeler t1 = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, engine, kickStart);
            System.out.println(t1);
        }

        else {
            System.out.println("Audio system");
            String audioSystem = sc.nextLine();

            System.out.println("Number of doors");
            int numberOfDoors = sc.nextInt();
            FourWheeler f1 = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, engine, audioSystem,
                    numberOfDoors);

            System.out.println(f1);
        }
        sc.close();
    }
}
