package Day4;

public class Circle extends Shape {
    static private float pi = 3.14f;

    double calculateArea(int value) {
        return pi * (value * value);
    }
}
