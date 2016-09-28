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
        int array1[][], array2[][];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of symmetric matrices");
        arrSize = parseInt(reader.readLine());

        // initializing and filling arrays
        array1 = fillArray(arrSize);
        array2 = fillArray(arrSize);

        //constructing two objects of type Matrix
        Matrix m1 = new Matrix(array1);
        Matrix m2 = new Matrix(array2);

        System.out.println("Array #1");
        m1.printArray();
        System.out.println("Array #2");
        m2.printArray();

    }

    /**
     * Fill array with randoma number from 0 to 9.
     *
     * @param arrSize size of array
     * @return filled array
     */
    private static int[][] fillArray(int arrSize) {
        int[][] mas = new int[arrSize][arrSize];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (Math.random() * 10);
            }
        }
        return mas;

    }
}
