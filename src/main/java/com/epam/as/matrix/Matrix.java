package com.epam.as.matrix;

/**
 * Create symetric array
 */
public class Matrix {
    private int[][] array;

    /**
     * Construct new array.
     *
     * @param rows rows of array
     * @param cols columns of array
     */
    public Matrix(int rows, int cols) {
        this.array = new int[rows][cols];
    }

    /**
     * Getter array element by indexes
     *
     * @param rows index of rows of array
     * @param cols index columns of array
     * @return element of array
     */
    public int getArrayElement(int rows, int cols) {
        return array[rows][cols];
    }

    /**
     * Setter value for array elements by indexes
     *
     * @param rows  index of rows of array
     * @param cols  index columns of array
     * @param value the value of element of array
     */
    public void setArrayElement(int rows, int cols, int value) {
        this.array[rows][cols] = value;
    }

    /**
     * Printing array.
     *
     * @param array the array for print
     */
    public void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}
