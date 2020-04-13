package _5advanced_object_oriented_design.baitap.resizeable;

import _4ke_thua.thuchanh.Circle;
import _4ke_thua.thuchanh.Rectangle;
import _4ke_thua.thuchanh.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /* Viết một chương trình tạo ra một mảng cách hình. Với mỗi phần tử trong mảng, tăng kích thước phần tử đó lên theo một tỉ lệ ngẫu nhiên từ 1-100.
        Thông báo ra màn hình diện tích của phần tử trước và sau khi tăng kích thước.*/
        testCircle();
        testRectangle();
        testSquare();
    }


    static void testCircle() {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.0);
        circles[1] = new Circle(4.0);
        circles[2] = new Circle(5.0);

        for (Circle circle : circles) {
            System.out.println("Circle Area Before Resize: " + circle.getArea());
            circle.resize(randomNumber());
            System.out.println("");
        }
        System.out.println("-------------End Of Circle--------------------------");
    }

    static void testRectangle() {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3.0, 5.6);
        rectangles[1] = new Rectangle(3.1, 2.3);
        rectangles[2] = new Rectangle(3.2, 1.3);

        for (Rectangle rectangle : rectangles) {
            System.out.println("Rectangle Area Before Resize: " + rectangle.getArea());
            rectangle.resize(randomNumber());
            System.out.println("");
        }
        System.out.println("-------------End Of Rectangle--------------------------");
    }

    static void testSquare() {
        Square[] squares = new Square[3];
        squares[0] = new Square(10.0);
        squares[1] = new Square(6.3);
        squares[2] = new Square(2.1);

        for (Square square : squares) {
            System.out.println("Square Area Before Resize: " + square.getArea());
            square.resize(randomNumber());
            System.out.println("");
        }

    }

    static double randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
