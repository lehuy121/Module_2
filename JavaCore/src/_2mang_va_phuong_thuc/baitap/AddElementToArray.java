package _2mang_va_phuong_thuc.baitap;

import java.util.Scanner;

public class AddElementToArray {
    static int[] arraysNumber = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

    public static void main(String[] args) {
        userInput();
    }

    static void userInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Add element to Array");
        System.out.println("Enter value:");
        int value = scan.nextInt();

        System.out.println("Enter index:");
        int index = scan.nextInt();

        addElementToArray(arraysNumber, value, index);
        display(arraysNumber);

    }

    static void addElementToArray(int[] arr, int value, int index) {
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Can't insert element to array");
            return;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }


    static void display(int[] arr) {
        System.out.println("Array list: ");
        for (int element : arr) {
            System.out.print(+element + " ");
        }
        System.out.println("");
    }
}
