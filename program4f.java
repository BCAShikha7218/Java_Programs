/*Write a program that checks whether a given square matrix is a magic square or not. A
magic square is a square matrix where the sum of each row, each column, and both
diagonals is the same.*/

public class program4f {

    public static void main(String[] args) {

	System.out.println("Shikha  2210997218");

        int[][] matrix = {
            { 2, 7, 6 },
            { 9, 5, 1 },
            { 4, 3, 8 }
        };

        if (isMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = n * (n * n + 1) / 2; // Magic sum for a magic square

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                return false;
            }
        }

        // Check diagonals
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n - 1 - i];
        }
        if (diagonalSum1 != magicSum || diagonalSum2 != magicSum) {
            return false;
        }

        return true;
    }
}
