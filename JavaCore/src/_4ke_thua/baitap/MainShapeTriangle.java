package _4ke_thua.baitap;

import java.util.Scanner;

public class MainShapeTriangle {
    public static void main(String[] args) {
        initShape();
        initTriangle();
    }

    static void initShape() {
        Shape shape = new Shape();
        System.out.println(shape.toString());

    }

    static void initTriangle() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input color: ");
        String color = scan.nextLine();

        System.out.println("Input side1: ");
        double side1 = scan.nextDouble();

        System.out.println("Input side2: ");
        double side2 = scan.nextDouble();

        System.out.println("Input side3: ");
        double side3 = scan.nextDouble();

        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle.toString());
    }
}
