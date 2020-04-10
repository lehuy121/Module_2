package _4ke_thua.thuchanh;

public class Circle extends Shape {
    private double radius;
    protected Circle(){
       this.radius = 1.0;
    }
    protected Circle(double radius){
        this.radius = radius;
    }
    protected Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
