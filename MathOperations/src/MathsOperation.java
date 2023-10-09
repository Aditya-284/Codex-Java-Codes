// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MathsOperation {
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    static double add(int a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(3, 2));
        System.out.println(add(13.6,20.5));
        System.out.println(add(5,20.5));

    }
}