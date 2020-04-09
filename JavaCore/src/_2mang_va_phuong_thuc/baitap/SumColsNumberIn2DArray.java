package _2mang_va_phuong_thuc.baitap;

import java.util.Scanner;

public class SumColsNumberIn2DArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arrayNumber = init2DArray();
        display(arrayNumber);
        System.out.println("Input column number:");
        int colNumber = scanner.nextInt();
        int sumCol = sumColsNumber(arrayNumber, colNumber);
        System.out.print("Sum of column: " + sumCol);

    }

    static int[][] init2DArray() {
        int row = 0;
        int col = 0;
        System.out.println("Input row size: ");
        row = scanner.nextInt();
        System.out.println("Input col size: ");
        col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Input value");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int sumColsNumber(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

}
