package _3lop_va_doi_tuong.baitap;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        System.out.println("Enter b: ");
        double b = scan.nextDouble();
        System.out.println("Enter c: ");
        double c = scan.nextDouble();
        QuadraticEquation obj = new QuadraticEquation(a, b, c);
        double delta = obj.getDiscriminant();
        System.out.println("Delta = " + delta);
        if (delta >= 0) {
            System.out.println(obj.getRoot1());
            System.out.println(obj.getRoot2());
        } else if (delta == 0) {
            System.out.println(obj.getRoot1());

        } else {
            System.out.print("“The equation has no roots”");
        }
    }
}
