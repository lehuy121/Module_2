package _4ke_thua.thuchanh;

import _5advanced_object_oriented_design.baitap.colorable.Colorable;
import _5advanced_object_oriented_design.baitap.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {

    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }



    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Square Area After Resize: "+ (this.getArea() + this.getArea() * (percent / 100)));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }
}
