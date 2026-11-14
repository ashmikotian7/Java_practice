import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Count number of digits
        int countTemp = number;
        int digits = 0;
        while (countTemp > 0) {
            countTemp /= 10;
            digits++;
        }

        // Calculate sum of digits raised to the power of 'digits'
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

