package views;

import commons.DefineConstants;
import models.Customer;

public class CustomerView implements DefineConstants {
    public static void displayAllCustomer(Customer customers) {
        System.out.println(customers.showInfo());
    }

    public static void displayAllCustomer(Integer key, String customers) {
        System.out.println(key + ": " + customers);
    }
}
