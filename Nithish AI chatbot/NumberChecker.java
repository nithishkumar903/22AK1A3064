import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else if (sumOfDivisors < number) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is an abundant number.");
        }
    }
}