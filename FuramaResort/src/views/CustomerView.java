package views;

import commons.CommonVariable;
import models.Customer;

public class CustomerView implements CommonVariable {
    public static void displayAllCustomer(Customer customers) {
        System.out.println(customers.showInfo());
    }

    public static void displayAllCustomer(Integer key, String customers) {
        System.out.println(key + ": " + customers);
    }
}
