import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        int length = number.length();
        int mid = length / 2;
        StringBuilder secondHalf = new StringBuilder(number.substring(0, mid));
        secondHalf.reverse();
        String firstHalf = number.substring(mid);
        String result = firstHalf.toString() + secondHalf;
        System.out.println("Half-reversed number: " + result);
    }
}

 
