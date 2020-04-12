package _4ke_thua.baitap;

import java.util.Arrays;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    Point() {

    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected float getX() {
        return x;
    }

    protected void setX(float x) {
        this.x = x;
    }

    protected float getY() {
        return y;
    }

    protected void setY(float y) {
        this.y = y;
    }

    protected void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {

        return "X: " + this.getX() + ", Y: " + this.getY() + ", XY: " + Arrays.toString(this.getXY());
    }
}
