package com.epam.as.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;


/**
 * This program demonstrates multiplication of two matrices.
 *
 * @author Andrey Shulga
 * @version 1.0 2016-09-29
 */
public class MatrixTest {
    public static void main(String[] args) throws IOException {

        int arrSize;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of symmetric matrices");
        arrSize = parseInt(reader.readLine());

        //Create and fill matrices
        Matrix m1 = new Matrix(arrSize, arrSize);
        MatrixFill.arrayRandomFill(m1, arrSize);
        Matrix m2 = new Matrix(arrSize, arrSize);
        MatrixFill.arrayRandomFill(m2, arrSize);

        System.out.println("Matrix #1");
        System.out.println(m1);
        System.out.println("Matrix #2");
        System.out.println(m2);

        //Multiply matrices
        MatrixMultiplication multiplication = new MatrixMultiplication();
        System.out.println("Result of multiplication two matrices");
        System.out.println(multiplication.multiplyMatrices(m1, m2));
    }


}
