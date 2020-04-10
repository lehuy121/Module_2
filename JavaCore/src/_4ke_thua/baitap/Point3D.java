package _4ke_thua.baitap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    Point3D(float z) {
        super();
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.x, this.y, this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                '}';
    }
}
