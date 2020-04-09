package _2mang_va_phuong_thuc.thuchanh;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 8, 10, -1, 6};
        findMin(arrayNumber);
    }

    static void findMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min element: " + min + " At index: " + index);
    }
}
