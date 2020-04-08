package _2_MangVaPhuongThuc.BaiTap;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 9};
        int[] newArray = removeElement(array, 4);
        displayArray(newArray);
    }

    static int[] removeElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
            }
        }
        return arr;
    }

    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }
}
