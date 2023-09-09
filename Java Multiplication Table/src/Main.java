
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 100:\n");
        int num = sc.nextInt();
        System.out.println("We will now see the table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

        }
    }
}