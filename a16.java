import java.util.Scanner;

public class a16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the operation");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the num 2");
        double num2 = sc.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result is " + result);
    }
}
