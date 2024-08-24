import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is Armstrong or not: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfPowers = 0;
        int numberOfDigits = (int) Math.log10(number) + 1;

        while (number != 0) {
            int lastDigit = number % 10;
            sumOfPowers += Math.pow(lastDigit, numberOfDigits);
            number /= 10;
        }

        if (sumOfPowers == originalNumber) {
            System.out.println("The given number " + originalNumber + " is an Armstrong number.");
        } else {
            System.out.println("The given number " + originalNumber + " is not an Armstrong number.");
        }
    }
}