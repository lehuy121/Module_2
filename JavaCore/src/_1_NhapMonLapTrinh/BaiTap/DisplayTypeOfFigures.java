package _1_NhapMonLapTrinh.BaiTap;

import java.util.Scanner;

public class DisplayTypeOfFigures {
    public static void main(String[] args) {
        int choice = 1;
        Scanner scan = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            menu(choice);
        }
    }

    static void menu(int choice) {
        switch (choice) {
            case 1:
                rectangle(3, 7);
                break;
            case 2:
                squareTriangle();
                break;
            case 3:
                isoscelesTriangle();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }

    static void rectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j < width) {
                    System.out.print("* ");
                } else if (j == width) {
                    System.out.println("*");
                }
            }
        }
    }
    static void squareTriangle() {
        String star = "* ";
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println("");
        }
    }
    static void isoscelesTriangle(){
        String star = "* ";
        for (int i = 5; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println("");
        }
    }
}
