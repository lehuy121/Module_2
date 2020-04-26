package controllers;

import commons.CommonVariable;
import commons.ReadFile;
import models.Employee;
import views.EmployeeView;

import java.util.*;

public class EmployeeController implements CommonVariable {
    static void numberedAllEmployeesByMap() {
        Map<Integer, String> map = new HashMap<>();
        List<String> employeeLists = ReadFile.getDataFromCsvFile(EMPLOYEE_FILE_NAME);
        for (int i = 0, j = 1; i < employeeLists.size(); i++, j++) {
            map.put(j, employeeLists.get(i));
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            EmployeeView.displayAllEmployee(key, map.get(key));
        }
    }

    private static Stack<Employee> employeesStack() {
        List<Employee> employeeLists = ReadFile.getDataFromCsv(ENTITY_TYPE.EMPLOYEE);
        Stack<Employee> stackEmployee = new Stack<>();
        for (Employee employee : employeeLists) {
            stackEmployee.push(employee);
        }
        return stackEmployee;
    }

    public static void searchEmployeeByName(String name) {
        boolean found = false;
        for (Employee employee : employeesStack()) {
            if (employee.getEmployeeName().equals(name)) {
                EmployeeView.displaySearchResult(employee);
                found = true;
            }
        }
        if (!found) {
            EmployeeView.displaySearchResult(null);
        }

    }
}
