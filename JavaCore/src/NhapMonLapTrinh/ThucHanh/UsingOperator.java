package NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class UsingOperator {
    public static void main(String[] args) {
        float width, height;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = scan.nextFloat();

        System.out.println("Enter Height: ");
        height = scan.nextFloat();

        System.out.println("Rectangle is: " + calculateRectangle(width, height));

    }

    public static float calculateRectangle(float width, float height) {
        float result = width * height;
        return result;
    }
}
