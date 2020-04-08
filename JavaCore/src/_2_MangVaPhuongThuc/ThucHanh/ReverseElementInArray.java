package _2_MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ReverseElementInArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = initSize();
        int[] array = addElementToArray(size);
        displayArray(array);

        reverserArray(array);
        System.out.println("After reverse");
        displayArray(array);
    }

    static int initSize() {
        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        return size;
    }

    static int[] addElementToArray(int size) {
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    static int[] reverserArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    static void displayArray(int[] arr) {
        System.out.print("Array list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
}
