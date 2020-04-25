package views;

import models.Services;

import java.util.TreeSet;

public class ServicesView {
    public static void displayInformation(Services service){
        System.out.println(service.showInfo());
    }
    public static void displayInformationNoDuplicate(TreeSet<String> treeSet){
        for(String result : treeSet){
            System.out.println(result);
        }
    }
}
