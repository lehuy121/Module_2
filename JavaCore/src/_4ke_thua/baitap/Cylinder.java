package _4ke_thua.baitap;

public class Cylinder extends Circle {
    private double height;

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return super.getArea();
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + this.height
                + ", radius=" + super.getRadius()
                + ", color=" + super.getColor()
                + ", volume=" + this.getVolume()
                + "}";
    }
}
