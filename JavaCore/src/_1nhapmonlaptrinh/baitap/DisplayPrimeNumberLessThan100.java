package _1nhapmonlaptrinh.baitap;

public class DisplayPrimeNumberLessThan100 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();*/
        displayPrimeNumber();


    }

    static void displayPrimeNumber() {
        int result = 2;
        int count = 0;
        while (result < 100) {
            boolean flag = true;
            for (int i = 2; i < result; i++) {
                if (result % i == 0 && i != result) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
                System.out.println("Prime number" + count + ": " + result);

            }
            result++;

        }
    }

}
