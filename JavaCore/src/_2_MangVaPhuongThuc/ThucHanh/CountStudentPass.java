package _2_MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class CountStudentPass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = initSize();
        int[] array = addElementToArray(size);
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
            System.out.print("Enter a mark for student " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    static void displayArray(int[] arr) {
        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] >= 5 && arr[i] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
