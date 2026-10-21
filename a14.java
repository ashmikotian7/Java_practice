import java.util.Scanner;

public class a14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            long first = 0, second = 1;
            System.out.print("Fibonacci Series: ");

            for (int i = 1; i <= count; i++) {
                System.out.print(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        scanner.close();
    }
}
