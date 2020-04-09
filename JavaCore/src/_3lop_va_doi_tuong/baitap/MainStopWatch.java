package _3lop_va_doi_tuong.baitap;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int[] array = generateNumber();
        System.out.println(stopwatch.start());

        selectionSort(array);

        System.out.println(stopwatch.stop());
        System.out.println(stopwatch.getElapsedTime() + " Second");
    }

    static void print100Number() {
        for (int i = 0; i < 100000; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static int[] generateNumber() {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomFill();
        }
        return arr;
    }

    static void display(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    static int randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100000);
        return randomNum;
    }

    static int[] selectionSort(int arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
