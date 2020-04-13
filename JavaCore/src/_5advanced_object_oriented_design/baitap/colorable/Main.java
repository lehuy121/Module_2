package _5advanced_object_oriented_design.baitap.colorable;

import _4ke_thua.thuchanh.Rectangle;
import _4ke_thua.thuchanh.Square;

public class Main {
    public static void main(String[] args) {
        initRectangle();
    }
    static void initRectangle(){
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Square("blue", false, 4.5);
        rectangles[1] = new Square("blue", true, 4.6);
        rectangles[2] = new Square("white", true, 4.7);
        for (Rectangle rectangle: rectangles) {
            if(rectangle instanceof Square && rectangle.isFilled()){
                System.out.println(rectangle.getPerimeter());
                ((Square) rectangle).howToColor();
            }
        }
    }
}
