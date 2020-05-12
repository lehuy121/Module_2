public class Calculator {
    public static String calculator(float first, float second, char operator) {
        switch (operator) {
            case '+':
                return String.valueOf(first + second);
            case '-':
                return String.valueOf(first - second);
            case '*':
                return String.valueOf(first * second);
            case '/':
                if (second != 0) {
                    return String.valueOf(first / second);
                } else {
                    return "Can't divide by zero";
                }
            default:
                return "Invalid Operator";
        }
    }
}
