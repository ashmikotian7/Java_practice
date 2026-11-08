import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int temp = originalNumber;
        int reversedNumber = 0;

        // Negative numbers are typically not palindromes (e.g., -121 != 121-)
        if (originalNumber < 0) {
            System.out.println(originalNumber + " is not a palindrome.");
        } else {
            while (temp != 0) {
                int remainder = temp % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                temp /= 10;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome.");
            } else {
                System.out.println(originalNumber + " is not a palindrome.");
            }
        }

        scanner.close();
    }
}

