package controllers;

import commons.ReadFile;
import commons.Validation;
import commons.WriteFile;
import models.Customer;
import commons.DefineConstants;
import models.Services;
import views.CustomerView;

import java.util.*;

public class CustomerController implements DefineConstants {
    static Customer customer = new Customer();
    static List<String> listCustomer;
    static List<String> listService;
    static String getCustomerFromCsv;
    static String getService;
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
        WriteFile.writeData(CUSTOMER_FILE_NAME, getDataInput());
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

    public static void sortByName() {
        List<Customer> customerList;
        customerList = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        customerList.sort(new customerComparator());
        for (Customer customer : customerList) {
            CustomerView.displayAllCustomer(customer);
        }
    }

    public static void numberedAllCustomerByMap() {
        Map<Integer, String> map = new HashMap<>();
        List<Customer> customerList;
        customerList = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        for (int i = 0, j = 1; i < customerList.size(); i++, j++) {
            map.put(j, customerList.get(i).showInfo());
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            CustomerView.displayAllCustomer(key, map.get(key));
        }
    }

    public static void bookingService(int customerNumber, int serviceNumber, String fileName) {
        customerNumber--;
        serviceNumber--;
        listCustomer = ReadFile.getDataFromCsvFile(CUSTOMER_FILE_NAME);
        getCustomerFromCsv = listCustomer.get(customerNumber);

        listService = ReadFile.getDataFromCsvFile(fileName);
        getService = listService.get(serviceNumber);

        booking = new String[]{getCustomerFromCsv, getService};
        WriteFile.writeData(BOOKING_FILE_NAME, booking);
    }

    public static void bookingService(int customerNumber, int serviceNumber, EntityType service) {
        customerNumber--;
        serviceNumber--;
        List<Customer> listCustomer = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        getCustomerFromCsv = listCustomer.get(customerNumber).showInfo();

        List<Services> listService = ReadFile.getDataFromCsv(service);
        getService = listService.get(serviceNumber).showInfo();

        booking = new String[]{getCustomerFromCsv, getService};
        WriteFile.writeData(BOOKING_FILE_NAME, booking);

    }

    public static void main(String[] args) {

        List<Customer> listCustomer = ReadFile.getDataFromCsv(EntityType.CUSTOMER);
        String result = listCustomer.get(0).showInfo();
        System.out.println(result);
    }


    public static void showAllCustomerUsingMap() {
        Map<Integer, String> map = new HashMap<>();
        List<String> employeeLists = ReadFile.getDataFromCsvFile(CUSTOMER_FILE_NAME);
        for (int i = 0, j = 1; i < employeeLists.size(); i++, j++) {
            map.put(j, employeeLists.get(i));
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static class customerComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            int resultCompare = o1.getCustomerName().compareTo(o2.getCustomerName());
            if (resultCompare == 0) {
                return compareYear(o1, o2);
            }
            return resultCompare;
        }
    }

    private static int compareYear(Customer o1, Customer o2) {
        int yearBornFirstCustomer = Integer.parseInt(o1.getDayOfBirth().substring(6, 10));
        int yearBornSecondCustomer = Integer.parseInt(o2.getDayOfBirth().substring(6, 10));
        if (yearBornFirstCustomer == yearBornSecondCustomer) {
            return 0;
        } else if (yearBornFirstCustomer > yearBornSecondCustomer) {
            return 1;
        }
        return -1;
    }
}
