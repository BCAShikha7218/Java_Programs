//Write a program that calculates the sum of each row and each column in a 2D matrix and  displays the results.

import java.util.Scanner;

public class program4d {

    public static void main(String[] args) {

	System.out.println("Shikha  2210997218");

        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[] rowSums = new int[numRows];
        int[] colSums = new int[numCols];

        // Calculate row sums
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        // Calculate column sums
        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                colSums[j] += matrix[i][j];
            }
        }

        // Display row sums
        System.out.println("Row Sums:");
        for (int i = 0; i < numRows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        // Display column sums
        System.out.println("\nColumn Sums:");
        for (int j = 0; j < numCols; j++) {
            System.out.println("Column " + (j + 1) + ": " + colSums[j]);
        }
    }
}
