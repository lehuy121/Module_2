package _2mang_va_phuong_thuc.baitap;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 4, 7, 8, 9};
       // int[] newArray = removeElement(array, 4);
        int[] newArray = remove(array, 9);

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

    public static int[] remove(int[] arr, int target) {
        int count = 0;
        for (int element : arr) {
            if (element == target) {
                count++;
            }
        }

        if (count == 0) {
            return arr;
        }

        int[] result = new int[arr.length - count];
        int index = 0;
        for (int value : arr) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }


    static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println("");
    }
}
