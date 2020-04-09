package _3lop_va_doi_tuong.thuchanh;

public class Rectangle {
    // field
    public  final String AA = "aaa";
    double width, height;

    //constructor
    public Rectangle() {

    }

    //constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
