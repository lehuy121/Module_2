package controllers;

import commons.ReadFile;
import models.Employee;

import java.util.*;

public class EmployeeController {
    static void showAllEmployeeUsingMap() {
        Map<Integer, String> map = new HashMap<>();
        List<String> employeeLists = ReadFile.getDataFromCsvFile("Employee");
        for (int i = 0, j = 1; i < employeeLists.size(); i++, j++) {
            map.put(j, employeeLists.get(i));
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

    private static Stack<Employee> employeesStack() {
        List<Employee> employeeLists = ReadFile.getAllEmployee();
        Stack<Employee> stackEmployee = new Stack<>();
        for (Employee employee : employeeLists) {
            stackEmployee.push(employee);
        }
        return stackEmployee;
    }

    static void searchEmployeeByName(String name) {
        boolean found = false;
        for (Employee employee : employeesStack()) {
            if (employee.getEmployeeName().equals(name)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Name Not Found !!!");
        }
    }
}
