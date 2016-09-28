package com.epam.as.matrix;

/**
 * Create matrix.
 */
public class Matrix {
    private int[][] matrix;


    /**
     * @param matrix symmetric array
     */
    public Matrix(int matrix[][]) {
        this.matrix = matrix;

    }

    public void printArray() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
