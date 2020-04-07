package _1_NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Money: ");
        money = input.nextDouble();

        System.out.println("Time (month): ");
        month = input.nextInt();

        System.out.println("Interest rate: ");
        interestRate = input.nextDouble();

        calculate(money, interestRate, month);

    }

    static void calculate(double money, double interestRate, int month) {
        double totalInterest = 0;
        totalInterest = money * (interestRate / 100) / 12 * month;
        System.out.println("Total interest: " + totalInterest);
    }
}
