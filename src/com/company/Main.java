package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Matrix Calculator");

        System.out.println("Type in the number of rows for matrix A: ");
        int matrixAM = in.nextInt();

        System.out.println("Type in the number of columns for matrix A: ");
        int matrixAN = in.nextInt();

        System.out.println("Type in the number of rows for matrix B: ");
        int matrixBM = in.nextInt();

        System.out.println("Type in the number of columns for matrix B: ");
        int matrixBN = in.nextInt();

        if (matrixAN != matrixBM) {
            System.out.println("Sorry, this matrix multiplication is not possible.");
            System.exit(1);
        }
        int[][] matrixA = new int[matrixAM][matrixAN];
        int[][] matrixB = new int[matrixBM][matrixBN];
        int[][] matrixC = new int[matrixAM][matrixBN];

        System.out.println("Please print out the following values for matrix A: ");
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[0].length; j++) {
                System.out.printf("A%d%d ", (i + 1), (j + 1));
                matrixA[i][j] = in.nextInt();
            }
        }

        System.out.println("Please print out the following values for matrix B: ");
        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[0].length; j++) {
                System.out.printf("B%d%d ", (i + 1), (j + 1));
                matrixB[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixB[0].length; j++) {
                for(int x = 0; x < matrixA[0].length; x++) {
                    sum += (matrixA[i][x] * matrixB[x][j]);
                }
                matrixC[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Here is AB: ");
        System.out.println();
        for(int i = 0; i < matrixC.length; i++) {
            for(int j = 0; j < matrixC[0].length; j++) {
                System.out.printf("%5d", matrixC[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
}
