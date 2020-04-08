package _2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class UsingIllegalTriangleException {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scan = new Scanner(System.in);
            System.out.println("Input a:");
            a = scan.nextDouble();

            System.out.println("Input b:");
            b = scan.nextDouble();

            System.out.println("Input c:");
            c = scan.nextDouble();

        IllegalTriangleException triangleException = new IllegalTriangleException(a,b,c);

    }
}
