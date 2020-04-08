package _2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class MergeArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array1[] = initArray();
        System.out.println("Init array1 done: ");
        displayArray(array1);

        int array2[] = initArray();
        System.out.println("Init array2 done: ");
        displayArray(array2);

        int[] array3 = mergeArray(array1, array2);
        System.out.println("Array list after merge: ");
        displayArray(array3);
    }

    static int[] initArray() {
        int size = 0;
        System.out.println("Input size: ");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input value");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int[] mergeArray(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < arr1.length) {
                array[i] = arr1[i];
            } else {
                array[i] = arr2[i - arr1.length];
            }
        }
        return array;
    }

    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
}
