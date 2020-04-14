package _5advanced_object_oriented_design.baitap.resizeable;

import _4ke_thua.thuchanh.Circle;
import _4ke_thua.thuchanh.Rectangle;
import _4ke_thua.thuchanh.Shape;
import _4ke_thua.thuchanh.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(3.0, 5.6);
        shapes[2] = new Square(10.0);
        shapes[3] = new Circle(5.0);

        for (Shape shape : shapes) {
            shape.resize(randomNumber());
        }

    }

    static double randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
