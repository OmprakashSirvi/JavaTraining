package Day4;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("1: Square");
        System.out.println("2: Circle");

        Scanner sc = new Scanner(System.in);
        String shape = sc.next();

        if (shape.equals("square") || shape.equals("Square")) {
            System.out.println("Enter the side of square");
            int value = sc.nextInt();
            Square s1 = new Square();
            System.out.print("Area of the square : ");
            System.out.println(s1.calculateArea(value));

        } else if (shape.equals("circle") || shape.equals("Circle")) {
            System.out.println("Enter the radius of circle");
            int value = sc.nextInt();
            Circle s1 = new Circle();
            System.out.print("Area of Circle : ");
            System.out.println(s1.calculateArea(value));
        }

        sc.close();
    }
}
