package com.epam.as.matrix;

/**
 *Multiplication two matrices
 */
public class MatrixMultiplication {
    /**
     * @param m1 first matrix
     * @param m2 second matrix
     * @return result of multiplication
     */
    public Matrix multiplyMatrices(Matrix m1, Matrix m2) {
        int arrSize = m1.getArraiSize();
        Matrix result = new Matrix(arrSize, arrSize);
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                int value = 0;
                for (int k = 0; k < arrSize; k++) {
                    value += m1.getArrayElement(i, k) * m2.getArrayElement(k, j);
                }
                result.setArrayElement(i, j, value);
            }
        }
        return result;
    }
}
