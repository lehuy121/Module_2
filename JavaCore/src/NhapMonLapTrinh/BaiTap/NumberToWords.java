package NhapMonLapTrinh.BaiTap;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scan.nextInt();
        System.out.println(convert(input));
    }

     static String convert(int number) {
        String words = "";
        String ability = "Out of ability";
        String unitsArray[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        String tensArray[] = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"};
        if(number > 999 || number < 0){
            return ability;
        }
        if (number == 0) {
            return "Zero";
        }
        if ((number / 100) > 0) {
            words += convert(number / 100) + " Hundred ";
            number %= 100;
        }
        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // fetch the appropriate value from unit array
                words += unitsArray[number];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }

        return words;
    }
}
