package _5advanced_object_oriented_design.baitap.colorable;

import _4ke_thua.thuchanh.Circle;
import _4ke_thua.thuchanh.Rectangle;
import _4ke_thua.thuchanh.Shape;
import _4ke_thua.thuchanh.Square;

public class Main {
    public static void main(String[] args) {
        testColorAble();
    }

    static void testColorAble() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle("blue", false, 4.5, 5.5);
        shapes[1] = new Circle(4.6, "blue", false);
        shapes[2] = new Square("white", true, 4.7);
        shapes[3] = new Circle(4.6, "white", true);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.print(shape.getPerimeter());
                ((Square) shape).howToColor();
            } else {
                System.out.println(shape.getPerimeter());
            }
        }
    }
}
