package _2mang_va_phuong_thuc.baitap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int x, i, c;
        int n = 5;
        Scanner input = new Scanner(System.in);
        int[] array = new int[n];

        System.out.println("Nhập phần tử vào mảng: ");

        for (i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        System.out.print("Mảng trước khi xóa X là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n" + "Nhập X cần xóa khỏi mảng là : ");
        x = input.nextInt();

        for (c = i = 0; i < n; i++) {
            if (array[i] != x) {
                array[c] = array[i];
                c++;
            }
        }
        n = c;


        System.out.print("Mảng sau khi xóa X là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("Do dai Mảng sau khi xóa X là: " + array.length);
    }
}
