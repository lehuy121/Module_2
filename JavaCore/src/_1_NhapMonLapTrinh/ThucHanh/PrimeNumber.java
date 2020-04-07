package _1_NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        isPrimeNumber(number);
        isPrimeNumber(101);
        isPrimeNumber(103);
        isPrimeNumber(107);
        isPrimeNumber(109);
        isPrimeNumber(113);
    }

    static void isPrimeNumber(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
        }
        if (flag) {
            System.out.println(number + " Is a Prime");
        } else {
            System.out.println(number + " Is not a Prime");
        }
    }

}
