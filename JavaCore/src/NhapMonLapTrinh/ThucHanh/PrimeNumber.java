package NhapMonLapTrinh.ThucHanh;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        isPrimeNumber(number);
    }
    public static void isPrimeNumber(int number){
        if(number < 2){
            System.out.println("Is not a prime");
        }else{
            int i =2;
            boolean flag = true;
            while(i <= Math.sqrt(number)){
                if(number % i == 0){
                    flag = false;
                    break;
                }
                i++;
            }
            if(flag){
                System.out.println("Is a Prime");
            }else{
                System.out.println("Is not a Prime");
            }
        }
    }

}
