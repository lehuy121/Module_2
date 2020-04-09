package _1nhapmonlaptrinh.thuchanh;

public class FindElementInArray {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String input_name = scanner.nextLine();
        findName(students, input_name);
    }

     static void findName(String[] arr, String inputName) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false)
            System.out.println("Not found " + inputName + " in the list.");
    }

}

