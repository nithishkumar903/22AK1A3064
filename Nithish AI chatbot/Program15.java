import java.util.*;

public class Program15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("Substrings of even length:");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (substring.length() % 2 == 0) {
                    System.out.println(substring);
                }
            }
        }
    }
}