package Day3;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("HelloThere");
        String s4 = new String("HelloThere");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        s1 = "Not hello";
        s3 = "WellHelloThere";

        s1 = "Hello";
        s3 = "HelloThere";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }
}
