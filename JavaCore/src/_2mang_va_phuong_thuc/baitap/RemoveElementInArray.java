package _2mang_va_phuong_thuc.baitap;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 4, 7, 8, 9};
        int[] newArray = removeElement(array, 4);

        displayArray(newArray);
    }

    static int[] removeElement(int[] arr, int element) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == element) {
                //arr[i] = 0;
               // i -= 1;
                for (int j = i; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
            }
            // len--;
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
