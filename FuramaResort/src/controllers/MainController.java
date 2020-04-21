package controllers;

import models.*;

public class MainController implements DefineConstants {
    public static final int MAIN_MENU_ADD_NEW_SERVICE = 1;
    public static final int MAIN_MENU_SHOW_SERVICE = 2;
    public static final int MAIN_MENU_ADD_NEW_CUSTOMER = 3;
    public static final int MAIN_MENU_SHOW_INFO_CUSTOMER = 4;
    public static final int MAIN_MENU_ADD_NEW_BOOKING = 5;
    public static final int MAIN_MENU_SHOW_INFO_EMPLOYEE = 6;
    public static final int MAIN_MENU_BOOKING_MOVIE_TICKET_4D = 7;
    public static final int MAIN_MENU_FIND_EMPLOYEE = 8;
    public static final int MAIN_MENU_EXIT = 9;

    public static final int MENU_ADD_NEW_SERVICE_VILLA = 1;
    public static final int MENU_ADD_NEW_SERVICE_HOUSE = 2;
    public static final int MENU_ADD_NEW_SERVICE_ROOM = 3;
    public static final int MENU_ADD_NEW_SERVICE_BACK_TO_MAIN_MENU = 4;
    public static final int MENU_ADD_NEW_SERVICE_BACK_EXIT = 5;

    public static final int MENU_SHOW_SERVICE_SHOW_ALL_VILLA = 1;
    public static final int MENU_SHOW_SERVICE_SHOW_ALL_HOUSE = 2;
    public static final int MENU_SHOW_SERVICE_SHOW_ALL_ROOM = 3;
    public static final int MENU_SHOW_SERVICE_SHOW_ALL_NAME_VILLA_NOT_DUPLICATE = 4;
    public static final int MENU_SHOW_SERVICE_SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE = 5;
    public static final int MENU_SHOW_SERVICE_SHOW_ALL_NAME_ROM_NOT_DUPLICATE = 6;
    public static final int MENU_SHOW_SERVICE_BACK_TO_MAIN_MENU = 7;
    public static final int MENU_SHOW_SERVICE_EXIT = 8;
    public static final int MENU_BOOKING_BOOKING_VILA = 1;
    public static final int MENU_BOOKING_BOOKING_HOUSE = 2;
    public static final int MENU_BOOKING_BOOKING_ROOM = 3;
    public static final int MENU_BOOKING_BACK_TO_MAIN_MENU = 4;
    public static int choiceCustomer;
    public static int choiceService;

    static Villa villa = new Villa();
    static House house = new House();
    static Room room = new Room();
    static Customer customer = new Customer();

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        mainMenuMessage();
        switch (choiceMenu()) {
            case MAIN_MENU_ADD_NEW_SERVICE:
                addNewServices();
                break;
            case MAIN_MENU_SHOW_SERVICE:
                showServices();
                displayMainMenu();
                break;
            case MAIN_MENU_ADD_NEW_CUSTOMER:
                addNewCustomer();
                displayMainMenu();
                break;
            case MAIN_MENU_SHOW_INFO_CUSTOMER:
                showInformationOfCustomer();
                displayMainMenu();
                break;
            case MAIN_MENU_ADD_NEW_BOOKING:
                addNewBooking();
                break;
            case MAIN_MENU_SHOW_INFO_EMPLOYEE:
                showInformationOfEmployee();
                break;
            case MAIN_MENU_BOOKING_MOVIE_TICKET_4D:
                bookingMovieTicket4D();
                break;
            case MAIN_MENU_FIND_EMPLOYEE:
                findEmployee();
                break;
            case MAIN_MENU_EXIT:
                System.exit(0);
            default:
                invalidChoiceMenu();
                displayMainMenu();
        }
    }

    private static void addNewCustomer() {
        customer.addNewCustomer();
    }

    private static void showInformationOfCustomer() {
        customer.showInformationAndSortByName();
    }

    private static void addNewBooking() {
        customer.showInformationCustomer();
        System.out.println("Choice Customer");
        choiceCustomer = scan.nextInt();
        addNewBookingMenuMessage();
        switch (choiceMenu()) {
            case MENU_BOOKING_BOOKING_VILA:
                bookingVilla();
                break;
            case MENU_BOOKING_BOOKING_HOUSE:
                bookingHouse();
                break;
            case MENU_BOOKING_BOOKING_ROOM:
                bookingRoom();
                break;
            case MENU_BOOKING_BACK_TO_MAIN_MENU:
                displayMainMenu();
                break;
        }
    }

    private static void bookingVilla() {
        showAllVilla();
        System.out.println("Choice Villa");
        choiceService = scan.nextInt();
      customer.bookingService(choiceCustomer, choiceService, VILLA_FILE_NAME);
    }

    private static void bookingHouse() {
        showAllHouse();
        System.out.println("Choice House");
        choiceService = scan.nextInt();
        customer.bookingService(choiceCustomer, choiceService, HOUSE_FILE_NAME);
    }

    private static void bookingRoom() {
        showAllRoom();
        System.out.println("Choice Room");
        choiceService = scan.nextInt();
        customer.bookingService(choiceCustomer, choiceService, ROOM_FILE_NAME);
    }


    private static void showInformationOfEmployee() {
    }

    private static void bookingMovieTicket4D() {
    }

    private static void findEmployee() {
    }

    private static void addNewServices() {
        addNewServiceMenuMessage();
        switch (choiceMenu()) {
            case MENU_ADD_NEW_SERVICE_VILLA:
                addNewVilla();
                break;
            case MENU_ADD_NEW_SERVICE_HOUSE:
                addNewHouse();
                break;
            case MENU_ADD_NEW_SERVICE_ROOM:
                addNewRoom();
                break;
            case MENU_ADD_NEW_SERVICE_BACK_TO_MAIN_MENU:
                displayMainMenu();
                break;
            case MENU_ADD_NEW_SERVICE_BACK_EXIT:
                exitProgram();
                break;
            default:
                invalidChoiceMenu();
                addNewServices();
        }
    }

    private static void addNewVilla() {
        villa.addNewService();
    }

    private static void addNewHouse() {
        house.addNewService();
    }

    private static void addNewRoom() {
        room.addNewService();
    }

    private static void showServices() {
        showServiceMessage();
        switch (choiceMenu()) {
            case MENU_SHOW_SERVICE_SHOW_ALL_VILLA:
                showAllVilla();
                break;
            case MENU_SHOW_SERVICE_SHOW_ALL_HOUSE:
                showAllHouse();
                break;
            case MENU_SHOW_SERVICE_SHOW_ALL_ROOM:
                showAllRoom();
                break;
            case MENU_SHOW_SERVICE_SHOW_ALL_NAME_VILLA_NOT_DUPLICATE:
                showAllNameVillaNotDuplicate();
                break;
            case MENU_SHOW_SERVICE_SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE:
                showAllNameHouseNotDuplicate();
                break;
            case MENU_SHOW_SERVICE_SHOW_ALL_NAME_ROM_NOT_DUPLICATE:
                showAllNameRoomNotDuplicate();
                break;
            case MENU_SHOW_SERVICE_BACK_TO_MAIN_MENU:
                displayMainMenu();
                break;
            case MENU_SHOW_SERVICE_EXIT:
                exitProgram();
                break;
            default:
                invalidChoiceMenu();
                showServices();

        }
    }

    private static void showAllVilla() {

        villa.showAllService();
    }

    private static void showAllHouse() {
        house.showAllService();
    }

    private static void showAllRoom() {
        room.showAllService();
    }

    private static void showAllNameVillaNotDuplicate() {
        villa.showServiceNameNotDuplicate();

    }

    private static void showAllNameHouseNotDuplicate() {
        house.showServiceNameNotDuplicate();
    }

    private static void showAllNameRoomNotDuplicate() {
        room.showServiceNameNotDuplicate();
    }

    static void mainMenuMessage() {
        System.out.println(MAIN_MENU);
        System.out.println(ADD_NEW_SERVICE);
        System.out.println(SHOW_SERVICES);
        System.out.println(ADD_NEW_CUSTOMER);
        System.out.println(SHOW_INFO_OF_CUSTOMER);
        System.out.println(ADD_NEW_BOOKING);
        System.out.println(SHOW_INFO_OF_EMPLOYEE);
        System.out.println(BOOKING_MOVIE_TICKET_4D);
        System.out.println(FIND_EMPLOYEE);
        System.out.println(EXIT);
    }

    static void addNewServiceMenuMessage() {
        System.out.println(ADD_NEW_SERVICE_MENU);
        System.out.println(ADD_NEW_VILLA);
        System.out.println(ADD_NEW_HOUSE);
        System.out.println(ADD_NEW_ROOM);
        System.out.println(BACK_TO_MENU);
        System.out.println(EXIT_PROGRAM);
    }

    static void showServiceMessage() {
        System.out.println(SHOW_SERVICE_MENU);
        System.out.println(SHOW_ALL_VILLA);
        System.out.println(SHOW_ALL_HOUSE);
        System.out.println(SHOW_ALL_ROOM);
        System.out.println(SHOW_ALL_NAME_VILLA_NOT_DUPLICATE);
        System.out.println(SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE);
        System.out.println(SHOW_ALL_NAME_ROOM_NOT_DUPLICATE);
        System.out.println(BACK_TO_MAIN_MENU);
        System.out.println(EXIT_PROGRAM);
    }

    private static void addNewBookingMenuMessage() {
        System.out.println(BOOKING_MENU);
        System.out.println(BOOKING_MENU_BOOKING_VILLA);
        System.out.println(BOOKING_MENU_BOOKING_HOUSE);
        System.out.println(BOOKING_MENU_BOOKING_ROOM);
        System.out.println(BOOKING_MENU_BACK_TO_MAIN_MENU);
    }

    static int choiceMenu() {
        return scan.nextInt();
    }

    static void invalidChoiceMenu() {
        System.out.println(INVALID_MENU_CHOICE);
    }

    static void exitProgram() {
        System.out.println(EXIT);
        System.exit(0);
    }

}
