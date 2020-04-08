package _2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class SumDiagonals {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arrayNumber = init2DArray();
        display(arrayNumber);
        int sum = sumDiagonalArray(arrayNumber);
        System.out.println("Sum of two diagonal: " + sum);

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

    static int sumDiagonalArray(int[][] arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - i - 1;
            leftDiagonal += arr[i][i];
            rightDiagonal += arr[i][j];
        }
        return leftDiagonal + rightDiagonal;
    }
}
