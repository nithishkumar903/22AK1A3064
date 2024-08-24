import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        int position = isFibonacci(num);

        if (position != -1) {
            System.out.println(num + " is a Fibonacci number at position " + position);
        } else {
            System.out.println(num + " is not a Fibonacci number.");
        }
    }

    public static int isFibonacci(int num) {
        int a = 0, b = 1, position = 1;

        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
            position++;
        }

        if (b == num) {
            return position;
        } else {
            return -1;
        }
    }
}