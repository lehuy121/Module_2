package _2mang_va_phuong_thuc.baitap;

import java.util.Scanner;

public class FindMinElement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = initArray();
        findMin(array);
    }

    static int[] initArray() {
        System.out.println("Input size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input value");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void findMin(int[] arr) {
        int min;
        min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min element: " + min);
    }
}
