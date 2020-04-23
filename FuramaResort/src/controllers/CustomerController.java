package controllers;

import commons.ReadFile;
import commons.Validation;
import commons.WriteFile;
import models.Customer;
import commons.DefineConstants;

import java.util.*;

public class CustomerController implements DefineConstants {
    static Customer customer = new Customer();
    static List<String> listCustomer;
    static List<String> listService;
    static String getCustomerFromCsv;
    static String service;
    static String[] booking;

    public static void addNewCustomer() {
        scan.nextLine();
        System.out.println(INPUT_DATA_CUSTOMER);
        setName();
        setBirth();
        setGender();
        setIdCard();
        setPhoneNumber();
        setEmail();
        setType();
        setAddress();
        WriteFile.writeData("Customer", getDataInput());
    }

    private static String[] getDataInput() {
        return new String[]{customer.getCustomerName(), customer.getDayOfBirth(), customer.getGender(), customer.getIdCard(), customer.getPhoneNumber(),
                customer.getEmail(), customer.getCustomerType(), customer.getAddress()};
    }

    private static void setAddress() {
        System.out.println(ENTER_CUSTOMER_ADDRESS);
        customer.setAddress(scan.nextLine());
    }

    private static void setType() {
        do {
            System.out.println(ENTER_CUSTOMER_TYPE);
            customer.setCustomerType(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(customer.getCustomerType()));
    }

    private static void setEmail() {
        do {
            System.out.println(ENTER_CUSTOMER_EMAIL);
            customer.setEmail(scan.nextLine());
        } while (!Validation.isEmail(customer.getEmail()));
    }

    private static void setPhoneNumber() {
        do {
            System.out.println(ENTER_CUSTOMER_PHONE_NUMBER);
            customer.setPhoneNumber(scan.nextLine());
        } while (!Validation.isPositiveNumber(customer.getPhoneNumber()));
    }

    private static void setIdCard() {
        do {
            System.out.println(ENTER_CUSTOMER_ID_NUMBER);
            customer.setIdCard(scan.nextLine());
        } while (!Validation.isIdCard(customer.getIdCard()));
    }

    private static void setGender() {
        do {
            System.out.println(ENTER_CUSTOMER_GENDER);
            customer.setGender(scan.nextLine());
        } while (!Validation.isGender(customer.getGender()));
        customer.setGender(customer.getGender().substring(0, 1).toUpperCase() + customer.getGender().substring(1).toLowerCase());
    }

    private static void setBirth() {
        do {
            System.out.println(ENTER_CUSTOMER_BIRTH);
            customer.setDayOfBirth(scan.nextLine());
        } while (!Validation.isBirthday(customer.getDayOfBirth()));
    }

    private static void setName() {
        do {
            System.out.println(ENTER_CUSTOMER_NAME);
            customer.setCustomerName(scan.nextLine());
        } while (!Validation.isNameException(customer.getCustomerName()));
    }

    public static void showInformationAndSortByName() {
        List<Customer> customerList = new ArrayList<>();
        customerList = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        customerList.sort(new CustomerNameComparator());
        System.out.println(SORT_BY_CUSTOMER_NAME);
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }

    public static void showInformationCustomer() {
        List<Customer> customerList = new ArrayList<>();
        customerList = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }

    }

    public static void bookingService(int customerNumber, int serviceNumber, String fileName) {
        customerNumber--;
        serviceNumber--;
        listCustomer = ReadFile.getDataFromCsvFile("Customer");
        getCustomerFromCsv = listCustomer.get(customerNumber);

        listService = ReadFile.getDataFromCsvFile(fileName);
        service = listService.get(serviceNumber);

        booking = new String[]{getCustomerFromCsv, service};
        WriteFile.writeData("Booking", booking);

    }

    public static void showAllCustomerUsingMap() {
        Map<Integer, String> map = new HashMap<>();
        List<String> employeeLists = ReadFile.getDataFromCsvFile("Customer");
        for (int i = 0, j = 1; i < employeeLists.size(); i++, j++) {
            map.put(j, employeeLists.get(i));
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static class CustomerNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getCustomerName().compareTo(o2.getCustomerName());
        }
    }
}
