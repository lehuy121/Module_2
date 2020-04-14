package _5advanced_object_oriented_design.implicit_casting;

public class Implicit_Casting_Example {
    public static void main(String[] args)
    {
        byte i = 50;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;

        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);
    }
}
