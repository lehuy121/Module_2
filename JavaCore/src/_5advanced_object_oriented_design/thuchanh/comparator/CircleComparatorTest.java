package _5advanced_object_oriented_design.thuchanh.comparator;

import _4ke_thua.baitap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    static Circle[] circles = new Circle[3];
    public static void main(String[] args) {
        initCircles();
        compare();

    }

    static void initCircles(){

        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "blue");

        System.out.println("Pre-sorted:");
        for ( Circle circle : circles) {
            System.out.println(circle);
        }
    }
    static void compare(){
        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
