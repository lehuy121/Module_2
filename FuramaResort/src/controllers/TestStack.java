package controllers;

import commons.ReadFile;
import models.Employee;

import java.util.*;

public class TestStack {
    public static void main(String[] args) {
//        Stack<String> stackName = new Stack<>();
//        stackName.push("Huy1");
//        stackName.push("Huy2");
//        stackName.push("Huy3");
//        stackName.push("Huy4");
//        stackName.push("Huy10");
////        System.out.println(stackName.peek()); // lay ra element cuoi cung dc them vao KO LAM THAY DOI Size
////        System.out.println("PEEK"+stackName.size());
////        System.out.println(stackName.pop()); // lay ra element cuoi cung dc them vao THAY DOI Size
////        System.out.println("POP"+stackName.size());
//        for (String stack : stackName) {
//            System.out.print(stack + " ");
//        }
//        System.out.println("");
//        int index = stackName.search("Huy3");
//        System.out.println(stackName.get(index - 1));
        saveInfoEmployee();

    }
    public static void saveInfoEmployee() {
        boolean flag = true;
        List<Employee> employeeLists = ReadFile.getAllEmployee();
        Stack<Employee> stackName = new Stack<>();
        for(Employee employee : employeeLists){
            stackName.push(employee);
        }

        for(Employee stack : stackName){
            if(stack.getEmployeeName().contains("Le MinhHuy")){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }


}
