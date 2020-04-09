package _2mang_va_phuong_thuc.thuchanh;

import java.util.Scanner;

public class FindMaxElement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int[] array;

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = addElementToArray(size);
        displayArray(array);
        findMax(array);

    }

    static int[] addElementToArray(int size) {
        int[] arr;
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    static void displayArray(int[] arr) {
        System.out.print("Property list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    static void findMax(int[] arr) {
        int max = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }/*else if(arr[i] == max){
                index = i + 1;
            }*/
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
