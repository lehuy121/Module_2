package models;

import commons.ReadFile;
import commons.Test;
import commons.Validation;
import commons.WriteFile;

import java.util.List;

public class Customer implements DefineConstants {
    private String customerName;
    private String dayOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services useService;
    static int count = 0;
    static String id, serviceName, usedArea, rentCost, maxQuantityOfPeople, renType,
            roomStandard, descriptionOtherAmenities, poolArea, floorNumber, freeServiceIncluded;
    static List<String> listCustomer;
    static List<String> listService;
    static String customer;
    static String service;
    static String[] booking;

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public void addNewCustomer() {
        scan.nextLine();

        System.out.println(INPUT_DATA_CUSTOMER);

        do {
            System.out.println(ENTER_CUSTOMER_NAME);
            this.setCustomerName(scan.nextLine());
        } while (!Validation.isNameException(getCustomerName()));

        do {
            System.out.println(ENTER_CUSTOMER_BIRTH);
            this.setDayOfBirth(scan.nextLine());
        } while (!Validation.isBirthday(getDayOfBirth()));

        // chua lam validation va chuan hoa du lieu
        System.out.println(ENTER_CUSTOMER_GENDER);
        this.setGender(scan.nextLine());
        do {
            System.out.println(ENTER_CUSTOMER_ID_NUMBER);
            this.setIdCard(scan.nextLine());
        } while (!Validation.isIdCard(getIdCard()));

        do {
            System.out.println(ENTER_CUSTOMER_PHONE_NUMBER);
            this.setPhoneNumber(scan.nextLine());
        } while (!Validation.isPositiveNumber(getPhoneNumber()));

        do {
            System.out.println(ENTER_CUSTOMER_EMAIL);
            this.setEmail(scan.nextLine());
        } while (!Validation.isEmail(getEmail()));

        do {
            System.out.println(ENTER_CUSTOMER_TYPE);
            this.setCustomerType(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(getCustomerType()));

        System.out.println(ENTER_CUSTOMER_ADDRESS);
        this.setAddress(scan.nextLine());

        String[] data = {getCustomerName(), getDayOfBirth(), getGender(), getIdCard(), getPhoneNumber(),
                getEmail(), getCustomerType(), getAddress()};
        WriteFile.writeData("Customer", data);
    }

    public void showInformationAndSortByName() {
        ReadFile.showAndSortInformationCustomerByName();

    }

    public void showInformationCustomer() {
        ReadFile.getInformationCustomer();

    }

    public void bookingService(int customerNumber, int serviceNumber, String fileName) {
        customerNumber--;
        serviceNumber--;
         listCustomer = Test.readFileCsv("Customer");
        customer = listCustomer.get(customerNumber);

         listService = Test.readFileCsv(fileName);
        service = listService.get(serviceNumber);

        booking = new String[]{customer, service};
        WriteFile.writeData("Booking", booking);
//        id = ReadFile.getAllVilla().get(serviceNumber).getId();
//        serviceName = ReadFile.getAllVilla().get(serviceNumber).getServiceName();
//        usedArea = ReadFile.getAllVilla().get(serviceNumber).getUsedArea();
//        rentCost = ReadFile.getAllVilla().get(serviceNumber).getRentCost();
//        maxQuantityOfPeople = ReadFile.getAllVilla().get(serviceNumber).getMaxQuantityOfPeople();
//        renType = ReadFile.getAllVilla().get(serviceNumber).getRenType();
//        roomStandard = ReadFile.getAllVilla().get(serviceNumber).getRoomStandard();
//        descriptionOtherAmenities = ReadFile.getAllVilla().get(serviceNumber).getDescriptionOtherAmenities();
//        poolArea = ReadFile.getAllVilla().get(serviceNumber).getPoolArea();
//        floorNumber = ReadFile.getAllVilla().get(serviceNumber).getFloorNumber();
//
//        booking = new String[]{customer, id, serviceName, usedArea, rentCost, maxQuantityOfPeople, renType,
//                roomStandard, descriptionOtherAmenities, poolArea, floorNumber};


    }
    public String showInfo() {
        count += 1;
        return "Customer: " + count + "{" +
                "customerName='" + customerName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
