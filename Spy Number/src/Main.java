import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the Number:\n");
        int num = sc.nextInt();
        int sum = 0, prod = 1;
        while (num > 0) {
            sum += num % 10;
            prod *= num % 10;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
