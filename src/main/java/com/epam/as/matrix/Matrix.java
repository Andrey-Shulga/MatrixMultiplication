package com.epam.as.matrix;

/**
 * Create object with array field.
 */
public class Matrix {
    private int[][] matrix;

    public Matrix() {
    }
    /**
     * @param matrix symmetric array
     */
    public Matrix(int matrix[][]) {
        this.matrix = matrix;

    }

    /**
     * Multiplication's matrices.
     *
     * @param array1 symmetric array
     * @param array2 symmetric array
     * @return filled array with values which are result of multiplication two arrays.
     */
    public int[][] multiplication(int[][] array1, int[][] array2) {
        int[][] resArray = new int[array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                resArray[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return resArray;
    }

    /**
     * Output array to console.
     */
    public void printArray() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
