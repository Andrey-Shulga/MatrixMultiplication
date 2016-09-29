package com.epam.as.matrix;

/**
 * Create symetric array
 */
public class Matrix {
    public int[][] array;

    /**
     * @param rows rows of array
     * @param cols columns of array
     */
    public Matrix(int rows, int cols) {
        this.array = new int[rows][cols];
    }

    /**
     * @param rows index of rows of array
     * @param cols index columns of array
     * @return element of array
     */
    public int getArray(int rows, int cols) {
        return array[rows][cols];
    }
}
