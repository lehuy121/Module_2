package _4ke_thua.thuchanh;

import _5advanced_object_oriented_design.baitap.resizeable.Resizeable;

public abstract class Shape implements Resizeable {
    private String color;
    private boolean filled;

    protected Shape() {
        this.color = "green";
        this.filled = true;
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + this.getColor()
                + " and "
                + (this.isFilled() ? "filled" : "not filled");
    }

    @Override
    public abstract void resize(double percent);
}
