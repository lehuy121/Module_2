package _3lop_va_doi_tuong.baitap;

public class MainFan {
    public static void main(String[] args) {
        Fan vietnam = new Fan();
        vietnam.setSpeed(vietnam.FAST);
        vietnam.setRadius(10);
        vietnam.setColor("yellow");
        vietnam.setOn(true);
        System.out.println("vietnam Fan: "+vietnam.toString());


        Fan taiwan = new Fan();
        taiwan.setSpeed(taiwan.MEDIUM);
        taiwan.setRadius(5);
        System.out.println("taiwan Fan: "+taiwan.toString());

    }
}
