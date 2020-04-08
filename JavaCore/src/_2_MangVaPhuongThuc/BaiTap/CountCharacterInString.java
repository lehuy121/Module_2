package _2_MangVaPhuongThuc.BaiTap;

public class CountCharacterInString {
    public static void main(String[] args) {
        String string = "Hello Java";
        countCharacter(string, 'a');

    }

    static void countCharacter(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Number of occurrences of character " + character + " is: " + count);
    }
}
