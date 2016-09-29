package com.epam.as.matrix;

/**
 * Object with arrays' fields.
 */
public class Matrix {
    public int[][] array;
    public int[][] array1;
    public int[][] array2;

    /**
     * @param array symmetric array
     */
    public Matrix(int[][] array) {
        this.array = array;
    }

    /**
     * @param array1 symmetric array
     * @param array2 symmetric array
     */
    public Matrix(int array1[][], int array2[][]) {
        this.array1 = array1;
        this.array2 = array2;
    }

    /**
     * Multiplication matrices.
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
}
