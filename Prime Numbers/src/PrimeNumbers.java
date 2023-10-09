// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 5;

        System.out.println("The first 10 prime numbers are:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }
}