import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Matrix Addition
                System.out.println("\nMatrix Addition Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Matrix Multiplication
                System.out.println("\nMatrix Multiplication Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Transpose of Matrix 1
                System.out.println("\nTranspose of Matrix 1:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[j][i];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
