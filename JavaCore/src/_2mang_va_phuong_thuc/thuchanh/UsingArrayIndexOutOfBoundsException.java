package _2mang_va_phuong_thuc.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class UsingArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] randomNumberArrays = initArray();
        System.out.println("Input index: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        displayElementByIndex(randomNumberArrays, index);
    }

    static int[] initArray() {
        Random random = new Random();
        int[] array = new int[10];
        System.out.println("List element in Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        return array;
    }

    static void displayElementByIndex(int[] arr, int index) {
        try {
            System.out.println("Element value: " + arr[index - 1]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index exceeds the limit of the array");
        }

    }
}
