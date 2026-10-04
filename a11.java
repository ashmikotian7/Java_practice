import java.util.Scanner;

public class a11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two numbers: ");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();

		System.out.println("Multiplication: " + (first * second));
		if (second == 0) {
			System.out.println("Division and modulo are undefined for zero.");
		} else {
			System.out.println("Division: " + (first / second));
			System.out.println("Modulo: " + (first % second));
		}

		scanner.close();
	}
}
