package views;

import models.Employee;

public class EmployeeView {
    public static void displaySearchResult(Employee employee) {
        if (employee == null) {
            System.out.println("Not Found");

        } else {
            System.out.println(employee);
        }

    }

}
