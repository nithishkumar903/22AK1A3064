import java.util.Arrays;
import java.util.Scanner;

public class Program13 {
    public static int[] Program13(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order

        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = Program13(arr);
        System.out.println("The pair with the sum closest to zero is: " + Arrays.toString(result));

        scanner.close();
    }
}