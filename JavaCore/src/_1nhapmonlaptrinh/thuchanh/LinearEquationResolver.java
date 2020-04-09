package _1nhapmonlaptrinh.thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void solution(double a, double b) {
        double solution;
        if (a != 0) {
            solution = -b / a;
            System.out.printf("The solution is: %f", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();
        solution(a, b);

    }
}
