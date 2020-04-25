package controllers;

import commons.DefineConstants;

public class MainController implements DefineConstants {
    public static int choiceCustomer = 0;
    public static int choiceService = 0;

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
                CustomerController.addNewCustomer();
                displayMainMenu();
                break;
            case MAIN_MENU_SHOW_INFO_CUSTOMER:
                CustomerController.sortByName();
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
                displayMainMenu();
                break;
            case MAIN_MENU_FIND_EMPLOYEE:
                findEmployee();
                displayMainMenu();
                break;
            case MAIN_MENU_EXIT:
                System.exit(0);
            default:
                invalidChoiceMenu();
                displayMainMenu();
        }
    }

    private static void addNewBooking() {
        CustomerController.numberedAllCustomerByMap();
        System.out.println(CHOICE_CUSTOMER);
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
        System.out.println(CHOICE_VILLA);
        choiceService = scan.nextInt();
        CustomerController.bookingService(choiceCustomer, choiceService, VILLA_FILE_NAME);
    }

    private static void bookingHouse() {
        showAllHouse();
        System.out.println(CHOICE_HOUSE);
        choiceService = scan.nextInt();
        CustomerController.bookingService(choiceCustomer, choiceService, HOUSE_FILE_NAME);
    }

    private static void bookingRoom() {
        showAllRoom();
        System.out.println(CHOICE_ROOM);
        choiceService = scan.nextInt();
        CustomerController.bookingService(choiceCustomer, choiceService, ROOM_FILE_NAME);

    }


    private static void showInformationOfEmployee() {
        EmployeeController.numberedAllEmployeesByMap();
    }

    private static void bookingMovieTicket4D() {
        System.out.println(BOOKING_MOVIE_TICKET);
        BookingMovieController.bookingTicket();

    }

    private static void findEmployee() {
        scan.nextLine();
        System.out.println(SEARCH_EMPLOYEE);
        System.out.println(ENTER_EMPLOYEE_NAME);
        EmployeeController.searchEmployeeByName(scan.nextLine());
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
        ServicesController.addNewService(EntityType.VILLA, VILLA_FILE_NAME);
    }

    private static void addNewHouse() {
        ServicesController.addNewService(EntityType.HOUSE, HOUSE_FILE_NAME);
    }

    private static void addNewRoom() {
        ServicesController.addNewService(EntityType.ROOM, ROOM_FILE_NAME);
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
        ServicesController.getAllInformationService(EntityType.VILLA);
    }

    private static void showAllHouse() {
        ServicesController.getAllInformationService(EntityType.HOUSE);
    }

    private static void showAllRoom() {
        ServicesController.getAllInformationService(EntityType.ROOM);
    }

    private static void showAllNameVillaNotDuplicate() {
        ServicesController.getNameServiceAndRemoveDuplicate(EntityType.VILLA);
    }

    private static void showAllNameHouseNotDuplicate() {
        ServicesController.getNameServiceAndRemoveDuplicate(EntityType.HOUSE);
    }

    private static void showAllNameRoomNotDuplicate() {
        ServicesController.getNameServiceAndRemoveDuplicate(EntityType.ROOM);
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
        System.out.println(ADD_NEW_SERVICE_MENU_EXIT);
    }

    static void showServiceMessage() {
        System.out.println(SHOW_SERVICE_MENU);
        System.out.println(SHOW_ALL_VILLA);
        System.out.println(SHOW_ALL_HOUSE);
        System.out.println(SHOW_ALL_ROOM);
        System.out.println(SHOW_ALL_NAME_VILLA_NOT_DUPLICATE);
        System.out.println(SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE);
        System.out.println(SHOW_ALL_NAME_ROOM_NOT_DUPLICATE);
        System.out.println(SHOW_SERVICE_MENU_BACK_TO_MAIN_MENU);
        System.out.println(SHOW_SERVICE_MENU_EXIT_PROGRAM);
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
        System.out.println(EXIT_MESSAGE);
        System.exit(0);
    }

}
