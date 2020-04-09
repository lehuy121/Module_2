package _1nhapmonlaptrinh.baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter USD: ");
        int usd = scan.nextInt();
        convert_USD_To_VND(usd);
    }

    static void convert_USD_To_VND(int usd) {
        final int RATE_VND = 23000;
        int result = RATE_VND * usd;
        System.out.println(usd + " USD" + " = " + result + " VND");
    }
}
