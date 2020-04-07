package NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class CalculateDaysInMonth {

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");

        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            calculate(input);
        } else {
            System.out.println("Invalid input. Input must be an Integer value");
        }
    }

    public static void calculate(int month) {
        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");
                break;
            default:
                System.out.println("Invalid month!");

        }
    }

}

