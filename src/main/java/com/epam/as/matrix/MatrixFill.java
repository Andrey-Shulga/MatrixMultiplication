package com.epam.as.matrix;

/**
 * Fill Matrix array with random numbers from 1 to 9
 */
public class MatrixFill {
    /**
     * @param matrix  the symetric array
     * @param arrSize the size of symmetric array
     */
    public void arrayRandomFill(Matrix matrix, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                int value = (int) (Math.random() * 10 + 1);
                matrix.setArrayElement(i, j, value);
            }
        }
    }
}
