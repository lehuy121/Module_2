package _3lop_va_doi_tuong.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.plaf.SliderUI;
import java.sql.SQLOutput;

public class Fan {
    protected final int SLOW = 1;
    protected final int MEDIUM = 2;
    protected final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + "speed=" + this.getSpeed() + (this.isOn() ? ", Fan is on" : ", Fan is off") + ", radius=" + this.getRadius() + ", color='" + this.getColor() + "'" + "}";
    }
}
