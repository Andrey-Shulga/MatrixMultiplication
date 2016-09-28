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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of symmetric matrices");
        int matsize = parseInt(reader.readLine());

        // construct a Matrix object
        Matrix m1 = new Matrix(matsize);
        Matrix m2 = new Matrix(matsize);
    }
}
