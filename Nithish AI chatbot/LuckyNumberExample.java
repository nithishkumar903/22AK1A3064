import java.util.Scanner;

public class LuckyNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (DD-MM-YYYY): ");
        String dob = sc.next();

        // Remove hyphens and convert to an integer
        int sum = 0;
        for (int i = 0; i < dob.length(); i++) {
            char digit = dob.charAt(i);
            if (Character.isDigit(digit)) {
                sum += digit - '0'; // Convert char to int
            }
        }

        // Calculate the lucky number
        while (sum >= 10) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        System.out.println("Your lucky number is: " + sum);
    }
}