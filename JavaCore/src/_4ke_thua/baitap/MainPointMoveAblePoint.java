package _4ke_thua.baitap;

public class MainPointMoveAblePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        point.setXY(2.0f,2.0f);
        System.out.println(point.toString());

        MoveAblePoint moveAblePoint = new MoveAblePoint();
        moveAblePoint.setSpeed(5f,1f);
        System.out.println(moveAblePoint.toString());
        System.out.println(moveAblePoint.move());
    }
}
