
import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Check positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 2. Check even or odd
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 3. Check divisibility by both 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }

        sc.close();
    }
}
