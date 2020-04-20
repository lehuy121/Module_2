package controllers;

import models.*;

public class MainController implements DefineConstants {
    public static final int MAIN_MENU_ADD_NEW_SERVICE = 1;
    public static final int MAIN_MENU_SHOW_SERVICE = 2;
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
    static Villa villa = new Villa();
    static House house = new House();
    static Room room = new Room();

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
                break;
            case MAIN_MENU_EXIT:
                System.out.println(EXIT);
                System.exit(0);
            default:
                invalidChoiceMenu();
                displayMainMenu();
        }
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
        System.out.println(BACK_TO_MENU);
        System.out.println(EXIT_PROGRAM);
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
