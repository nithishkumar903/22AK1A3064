import java.math.BigInteger;
import java.util.Scanner;

public class LargeIntegerOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the first 40-digit integer with input validation
    System.out.print("Enter a 40-digit integer: ");
    BigInteger num1;
    do {
      String input = scanner.nextLine();
      try {
        num1 = new BigInteger(input);
        if (input.length() > 40) {
          System.out.println("Error: Input exceeds 40 digits. Please try again.");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input. Please enter a valid 40-digit integer.");
      }
    } while (true);

    // Read the second 40-digit integer with input validation
    System.out.print("Enter another 40-digit integer: ");
    BigInteger num2;
    do {
      String input = scanner.nextLine();
      try {
        num2 = new BigInteger(input);
        if (input.length() > 40) {
          System.out.println("Error: Input exceeds 40 digits. Please try again.");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input. Please enter a valid 40-digit integer.");
      }
    } while (true);

    // Demonstrate relational operations
    System.out.println("num1 == num2: " + num1.equals(num2));
    System.out.println("num1 != num2: " + !num1.equals(num2));
    System.out.println("num1 > num2: " + num1.compareTo(num2) > 0);
    System.out.println("num1 < num2: " + num1.compareTo(num2) < 0);
    System.out.println("num1 >= num2: " + num1.compareTo(num2) >= 0);
    System.out.println("num1 <= num2: " + num1.compareTo(num2) <= 0);
  }
}