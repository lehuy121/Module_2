package _4ke_thua.thuchanh;

public class Main {
    public static void main(String[] args) {
        testShape();
        testCircle();
        testRectangle();
        testSquare();


    }
    static void testShape(){
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape.toString());
    }
    static void testCircle(){
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
    static void testRectangle(){
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange",true , 2.5, 3.8);
        System.out.println(rectangle);
    }
    static void testSquare(){
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow",true , 5.8);
        System.out.println(square);
    }
}
