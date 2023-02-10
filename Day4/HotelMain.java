package Day4;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hotel Tarrif calculator");
        System.out.println("1 : Deulux Room");
        System.out.println("2: Deulux AC Room");
        System.out.println("3: Suite AC Room");
        System.out.print("Select Room type : ");

        int index = sc.nextInt();

        System.out.println("Enter hotel name");
        String hotelName = sc.next();
        System.out.println("Enter number of square feet");
        int numberOfSquareFeet = sc.nextInt();
        System.out.println("Has TV? (yes/no)");
        String hasTV = sc.next();
        System.out.println("Has Wifi? (yes/no)");
        String hasWifi = sc.next();

        System.out.print("Your tarrif is : ");

        switch (index) {
            case 1:
                DeuluxRoom d1 = new DeuluxRoom(hotelName, numberOfSquareFeet, (hasTV.equals("yes") ? true : false),
                        hasWifi.equals("yes") ? true : false);
                System.out.println(d1.calculateTarrif());
                break;
            case 2:
                DeuluxACRoom dAC1 = new DeuluxACRoom(hotelName, numberOfSquareFeet,
                        (hasTV.equals("yes") ? true : false),
                        hasWifi.equals("yes") ? true : false);
                System.out.println(dAC1.calculateTarrif());
                break;

            case 3:
                SuiteACRoom sAC1 = new SuiteACRoom(hotelName, numberOfSquareFeet, (hasTV.equals("yes") ? true : false),
                        hasWifi.equals("yes") ? true : false);
                System.out.println(sAC1.calculateTarrif());
                break;

            default:
                System.out.println("Enter Valid Info");
        }

        sc.close();
    }
}
