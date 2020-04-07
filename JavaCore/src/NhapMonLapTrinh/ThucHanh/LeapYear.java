package NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int input = scan.nextInt();
        isLeapYear(input);
    }

     static void isLeapYear(int year) {
        boolean flag = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }

            } else {
                flag = true;
            }
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Is a leap year");
        } else {
            System.out.println("Is not a leap year");
        }
    }
}
