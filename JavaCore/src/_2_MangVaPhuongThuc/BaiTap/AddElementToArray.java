package _2_MangVaPhuongThuc.BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddElementToArray {
    static int[] arraysNumber = new int[10];

    public static void main(String[] args) {
        userInput();
    }

    static void userInput() {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int index = 0;
        while (index <= arraysNumber.length) {
            System.out.println("Add element to Array. Input index > 10 if you want to quit.");
            System.out.println("Enter value:");
            value = scan.nextInt();
            System.out.println("Enter index:");
            index = scan.nextInt();
            if (index <= arraysNumber.length) {
                addElementToArray(arraysNumber, value, index);
                display(arraysNumber);
            } else {
                System.out.println("Index input: " + index + " is greater than size of Array. Can't add, stop program!!!");
            }
        }

    }

    static void addElementToArray(int[] arr, int value, int index) {
        arr[index - 1] = value;
    }

    static void display(int[] arr) {
        System.out.println("Array list: ");
        for (int element : arr) {
            System.out.print(+element + " ");
        }
        System.out.println("");
    }
}
