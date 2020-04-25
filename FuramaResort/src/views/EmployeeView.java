package views;

import commons.DefineConstants;
import models.Employee;

public class EmployeeView implements DefineConstants {
    public static void displaySearchResult(Employee employee) {
        if (employee == null) {
            System.out.println(CAN_NOT_FOUND_EMPLOYEE_NAME);
        } else {
            System.out.println(employee);
        }
    }

    public static void displayAllEmployee(Integer key, String employees) {
        System.out.println(key + " " + employees);
    }

}
