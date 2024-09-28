import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] charCount = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                System.out.println("'" + (char) i + "' is repeated " + charCount[i] + " times");
            }
        }
    }
}