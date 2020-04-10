package _2mang_va_phuong_thuc.baitap;

public class Triangle {

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        isNegative(side1, side2, side3);
        isSumOfTwoSideLessThanOtherSide(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void isNegative(double number1, double number2, double number3) throws IllegalTriangleException {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            throw new IllegalTriangleException("Khong duoc nhap so < 0");
        }
    }

    public void isSumOfTwoSideLessThanOtherSide(double number1, double number2, double number3) throws IllegalTriangleException {
        if (number1 + number2 < number3) {
            throw new IllegalTriangleException("Tong 2 side < side con lai");
        } else if (number1 + number3 < number2) {
            throw new IllegalTriangleException("Tong 2 side < side con lai");
        } else if (number2 + number3 < number1) {
            throw new IllegalTriangleException("Tong 2 side < side con lai");
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {

        return "Triangle{" +
                "side1=" + this.getSide1() +
                ", side2=" + this.getSide2() +
                ", side3=" + this.getSide3() +
                '}';
    }
}
