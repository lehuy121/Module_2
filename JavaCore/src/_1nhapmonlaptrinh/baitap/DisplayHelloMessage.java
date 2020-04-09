package _1nhapmonlaptrinh.baitap;

import java.util.Scanner;

public class DisplayHelloMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();

        System.out.println("Hello: " + name);
    }
}
