import java.util.Scanner;

public class Program14 {
    public static void Program14(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m - 1];
            matrix[i][m - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        Program14(matrix);

        System.out.println("Matrix after interchanging first and last columns:");
        printMatrix(matrix);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}