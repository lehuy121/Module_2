package _4ke_thua.baitap;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(5.0,2.0,"blue");
        cylinder.getVolume();
        System.out.println(cylinder);
    }
}
