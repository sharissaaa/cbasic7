import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1 = Integer.parseInt(br.readLine());
        int cols1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int rows2 = Integer.parseInt(br.readLine());
        int cols2 = Integer.parseInt(br.readLine());

        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        int[][] firstMatrix = new int[rows1][cols1];
        int[][] secondMatrix = new int[rows2][cols2];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                firstMatrix[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                secondMatrix[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows1 = firstMatrix.length;
        int cols1 = firstMatrix[0].length;
        int cols2 = secondMatrix[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }
}
