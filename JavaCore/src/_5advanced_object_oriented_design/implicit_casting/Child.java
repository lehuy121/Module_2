package _5advanced_object_oriented_design.implicit_casting;

class Parent {
    public void disp() {
        System.out.println("Parent disp called");
    }
}

public class Child extends Parent {
    public void disp() {
        System.out.println("Child disp called");
    }
    public void add() {
        System.out.println("Child add called");
    }

    public static void main(String[] args) {
        //Implicit Casting of a Class Type
        //We all know that when we are assigning smaller type to a larger type
        Parent p = new Child();
        p.disp();

        Child c = (Child) p;
        c.add();
    }
}
