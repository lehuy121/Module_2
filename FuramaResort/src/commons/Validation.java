package commons;

public class Validation {

    public static final String SERVICE_NAME_PATTERN = "^[A-Z][\\w ]*$";
    public static final String USED_AND_POOL_ARE_PATTERN = "^(([3-9]){0,9}[\\d]{0,3})\\.([\\d])*$";
    public static final String POSITIVE_NUMBER = "^(\\d)*$";
    public static final String MAXIMUM_PEOPLE = "^[1-9]$|^0[1-9]$|^1[0-9]$|^19$";
    public static final String SERVICE_INCLUDED = "^(massage|karaoke|food|drink|car)$";
    public static final String NAME_PATTERN = "^(\\b[A-Z]\\w*\\s*)+$";
    public static final String EMAIL_PATTERN = "^([a-z]{3})@([a-z]{3})\\.(com)$";
    public static final String ID_CARD_PATTERN = "^(([\\d]{3})\\ ([\\d]{3})\\ ([\\d]{3}))+$";
    public static final String NUMBER_PATTERN = "^([\\d]+)$";
    public static final String BIRTH_PATTERN = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/((19[\\d][1-9]|20[\\d][1-2]))$";
    public static final String INVALID_INPUT_NAME = "The first letter must be Uppercase";
    public static final String INVALID_INPUT_AREA = "Input number must be a Double number and greater than 30";
    public static final String INVALID_INPUT_POSITIVE_NUMBER = "Input number must be Positive Number";
    public static final String INVALID_INPUT_MAXIMUM_PEOPLE = "Maximum number must me greater 0 and less than 20";
    public static final String INVALID_INPUT_SERVICE_INCLUDED = "Service must be: massage, karaoke, food, drink, car";
    public static final String INVALID_INPUT_CUSTOMER_NAME = "Customer Name must capitalize the first character in each word";
    public static final String INVALID_INPUT_EMAIL = "Invalid. Email format is abc@abc.abc";
    public static final String INVALID_INPUT_ID_CARD = "Invalid. Id Card must be a number and format is XXX XXX XXX";
    public static final String INVALID_INPUT_NUMBER = "Invalid. Phone Number must be a number";
    public static final String INVALID_INPUT_BIRTH = "Invalid. Year born must be from 1901 to 2002";

    public static boolean isFirstLetterUppercase(String s) {

        if (!(s.matches(SERVICE_NAME_PATTERN))) {
            System.out.println(INVALID_INPUT_NAME);
            return false;
        }
        return true;
    }

    public static boolean isUsedArea_PoolArea(String s) {
        if (!(s.matches(USED_AND_POOL_ARE_PATTERN))) {
            System.out.println(INVALID_INPUT_AREA);
            return false;
        }
        return true;
    }

    public static boolean isPositiveNumber(String s) {
        if (!(s.matches(POSITIVE_NUMBER))) {
            System.out.println(INVALID_INPUT_POSITIVE_NUMBER);
            return false;
        }
        return true;
    }

    public static boolean isMaximumPeople(String s) {
        if (!(s.matches(MAXIMUM_PEOPLE))) {
            System.out.println(INVALID_INPUT_MAXIMUM_PEOPLE);
            return false;
        }

        return true;
    }
    public static boolean isServiceIncluded(String s){
        if(!(s.matches(SERVICE_INCLUDED))){
            System.out.println(INVALID_INPUT_SERVICE_INCLUDED);
            return false;
        }
        return true;
    }

    public static boolean isNameException(String s){
        if(!(s.matches(NAME_PATTERN))){
            System.out.println(INVALID_INPUT_CUSTOMER_NAME);
        }
        return true;
    }
    public static boolean isEmail(String s){
        if(!(s.matches(EMAIL_PATTERN))){
            System.out.println(INVALID_INPUT_EMAIL);
            return false;
        }
        return true;
    }
    public static boolean isIdCard(String s){
        if(!(s.matches(ID_CARD_PATTERN))){
            System.out.println(INVALID_INPUT_ID_CARD);
            return false;
        }
        return true;
    }
    public static boolean isNumber(String s){
        if(!(s.matches(NUMBER_PATTERN))){
            System.out.println(INVALID_INPUT_NUMBER);
            return false;
        }
        return true;
    }
    public static boolean isBirthday(String s){
        if(!(s.matches(BIRTH_PATTERN))){
            System.out.println(INVALID_INPUT_BIRTH);
            return false;
        }
        return true;

    }
}
