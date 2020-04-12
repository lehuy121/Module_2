package _4ke_thua.baitap;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    MoveAblePoint() {

    }

    MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", speed="+ Arrays.toString(this.getSpeed()) +
                '}';
    }
    public MoveAblePoint move(){
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
}
