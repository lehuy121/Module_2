package _1_NhapMonLapTrinh.BaiTap;

public class DisplayFirst20PrimeNumber {
    public static void main(String[] args) {
        displayPrimeNumber(30, 1000);
    }

    static void displayPrimeNumber(int limit, int range) {
        int number = 2;
        int count = 0;
        while (number < range) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0 && i != number) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
                if (count <= limit) {
                    System.out.println("Prime number" + count + ": " + number);
                }
            }
            number++;
        }
    }
}

