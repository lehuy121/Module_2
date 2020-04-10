package _4ke_thua.baitap;

import java.util.Arrays;

public class MainPoint2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

        Point3D point3D = new Point3D(4);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
