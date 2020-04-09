package _2mang_va_phuong_thuc.baitap;

import java.util.Scanner;

public class FindMaxElementIn2DArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = init2DArray();
        display(matrix);
        System.out.println("Max number in Array: " + findMax(matrix));

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

    static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
