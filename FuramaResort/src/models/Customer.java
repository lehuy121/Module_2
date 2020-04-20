package models;

import commons.WriteFile;

public class Customer implements DefineConstants {
    private String customerName;
    private String dayOfBirth;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services useService;

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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

        System.out.println(ENTER_CUSTOMER_NAME);
        this.setCustomerName(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_BIRTH);
        this.setDayOfBirth(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_GENDER);
        this.setGender(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_ID_NUMBER);
        this.setIdNumber(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_PHONE_NUMBER);
        this.setPhoneNumber(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_EMAIL);
        this.setEmail(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_TYPE);
        this.setCustomerType(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_ADDRESS);
        this.setAddress(scan.nextLine());

        System.out.println(ENTER_CUSTOMER_USE_SERVICE); // chua hieu
        //this.setUseService();

        String[] data = {getCustomerName(), getDayOfBirth(), getGender(), getIdNumber(), getPhoneNumber(),
                getEmail(), getCustomerType(), getAddress(), String.valueOf(getUseService())};
        WriteFile.writeData("Customer", data);
    }


    public String showInfo() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", useService=" + useService +
                '}';
    }
}
