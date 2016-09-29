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
        int[][] result;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of symmetric matrices");
        arrSize = parseInt(reader.readLine());

        //constructing a object of type Matrix with arrays' parameters
        Matrix matrix = new Matrix(fillArray(arrSize), fillArray(arrSize));

        System.out.println("Array#1");
        printArray(matrix.array1);
        System.out.println("Array#2");
        printArray(matrix.array2);

        //multiply two arrays on each other
        result = matrix.multiplication(matrix.array1, matrix.array2);

        System.out.println("Result of multiplication Array#1 with Array#2");
        printArray(result);
    }

    /**
     * Fill array[][] with random number from 0 to 9.
     *
     * @param arrSize size of array
     * @return filled array[][]
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

    /**
     * Output array to console.
     *
     * @param array [][]
     */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
