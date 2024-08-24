import java.util.Scanner;

public class MatrixTrace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int trace = 0;
        for (int i = 0; i < size; i++) {
            trace += matrix[i][i];
        }

        System.out.println("The trace of the matrix is: " + trace);

        // Close the scanner
        scanner.close();
    }
}