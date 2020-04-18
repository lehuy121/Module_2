package controllers;

import commons.ReadFile;
import commons.ReadFile1;
import commons.WriteFile;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.Scanner;
import java.util.UUID;

public class MainController {


    public static void main(String[] args) {
        displayMainMenu();
    }

    static void displayMainMenu() {
        mainMenuMessage();
        switch (choiceMenu()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 9:
                System.out.println("Exit Program");
                System.exit(0);
            default:
                invalidChoiceMenu();
                displayMainMenu();
        }
    }

    private static void addNewServices() {
        addNewServiceMenuMessage();
        switch (choiceMenu()) {
            case 1:
                addNewVilla(); // da add vao dc
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                exitProgram();
                break;
            default:
                invalidChoiceMenu();
                addNewServices();
        }
    }

    private static void addNewVilla() {
        scan.nextLine();
        System.out.println(INPUT_DATA_VILLA);

        Services villa = new Villa();
        villa.setId(UUID.randomUUID().toString().replace("_", ""));

        System.out.println("Enter Server Name: ");
        villa.setServiceName(scan.nextLine());

        System.out.println("Enter Used Area");
        villa.setUsedArea(scan.nextDouble());

        System.out.println("Enter Rent Cost");
        villa.setRentCost(scan.nextDouble());

        System.out.println("Enter Max Quantity Of People");
        villa.setMaxQuantityOfPeople(scan.nextInt());

        // scan.nextLine(); // nhận phím enter làm giá trị (fix bug nextInt mà sau nó là nextLine())
        System.out.println("Enter Rent Type");
        villa.setRenType(scan.nextLine());

        System.out.println("Enter Room Standard");
        ((Villa) villa).setRoomStandard(scan.nextLine());

        System.out.println("Enter Description Other Amenities");
        ((Villa) villa).setDescriptionOtherAmenities(scan.nextLine());

        System.out.println("Enter Pool Area");
        ((Villa) villa).setPoolArea(scan.nextDouble());

        System.out.println("Enter Floor Number");
        ((Villa) villa).setFloorNumber(scan.nextInt());
        String id = villa.getId();
        String serviceName = villa.getServiceName();
        String usedArea = Double.toString(villa.getUsedArea());
        String rentCost = Double.toString(villa.getRentCost());
        String maxQuantityPeople = Integer.toString(villa.getMaxQuantityOfPeople());
        String renType = villa.getRenType();
        String roomStandard = ((Villa) villa).getRoomStandard();
        String descriptionOtherAmenities = ((Villa) villa).getDescriptionOtherAmenities();
        String poolArea = Double.toString(((Villa) villa).getPoolArea());
        String floorNumber = Integer.toString(((Villa) villa).getFloorNumber());

        String[] data = {id, serviceName, usedArea, rentCost, maxQuantityPeople, renType, roomStandard, descriptionOtherAmenities, poolArea, floorNumber};
        // String[] data = {villa.showInfo()};
        WriteFile.writeData(VILLA_FILE_NAME, data);

    }

    private static void addNewHouse() {
        System.out.println(INPUT_DATA_HOUSE);
        scan.nextLine();
        Services house = new House();
        house.setId(UUID.randomUUID().toString().replace("_", ""));

        System.out.println("Enter Server Name: ");
        house.setServiceName(scan.nextLine());

        System.out.println("Enter Used Area");
        house.setUsedArea(scan.nextDouble());

        System.out.println("Enter Rent Cost");
        house.setRentCost(scan.nextDouble());

        System.out.println("Enter Max Quantity Of People");
        house.setMaxQuantityOfPeople(scan.nextInt());

        scan.nextLine(); // nhận phím enter làm giá trị (fix bug nextInt mà sau nó là nextLine())

        System.out.println("Enter Rent Type");
        house.setRenType(scan.nextLine());

        System.out.println("Enter Room Standard");
        ((House) house).setRoomStandard(scan.nextLine());

        System.out.println("Enter Description Other Amenities");
        ((House) house).setDescriptionOtherAmenities(scan.nextLine());

        System.out.println("Enter Floor Number");
        ((House) house).setFloorNumber(scan.nextInt());
    }

    private static void addNewRoom() {
        System.out.println(INPUT_DATA_ROOM);
        scan.nextLine();
        Services room = new Room();
        room.setId(UUID.randomUUID().toString().replace("_", ""));

        System.out.println("Enter Server Name: ");
        room.setServiceName(scan.nextLine());

        System.out.println("Enter Used Area");
        room.setUsedArea(scan.nextDouble());

        System.out.println("Enter Rent Cost");
        room.setRentCost(scan.nextDouble());

        System.out.println("Enter Max Quantity Of People");
        room.setMaxQuantityOfPeople(scan.nextInt());

        scan.nextLine(); // nhận phím enter làm giá trị (fix bug nextInt mà sau nó là nextLine())

        System.out.println("Enter Rent Type");
        room.setRenType(scan.nextLine());

        System.out.println("Enter Room Standard");
        ((Room) room).setFreeServiceIncluded(scan.nextLine());

    }

    private static void showServices() {
        showServiceMessage();
        switch (choiceMenu()) {
            case 1:
                showAllVilla(); // doing here
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
                break;
            case 5:
                showAllNameHouseNotDuplicate();
                break;
            case 6:
                showAllNameRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                exitProgram();
                break;
            default:
                invalidChoiceMenu();
                showServices();

        }
    }

    private static void showAllVilla() {

        // ReadFile.readData(VILLA_FILE_NAME);
//        String[] villa = new String[]{"id", "serviceName",
//                "usedArea", "rentCost", "maxQuantityOfPeople",
//                "renType", "roomStandard", "descriptionOtherAmenities", "poolArea", "floorNumber"};
        ReadFile1.readVillaFile();
    }

    private static void showAllHouse() {
        ReadFile.readData(HOUSE_FILE_NAME);
    }

    private static void showAllRoom() {
        ReadFile.readData(ROOM_FILE_NAME);
    }

    private static void showAllNameVillaNotDuplicate() {
    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameRoomNotDuplicate() {
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
        System.out.println(EXIT);
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
        System.out.println(EXIT);
    }

    static int choiceMenu() {
        return scan.nextInt();
    }

    static void invalidChoiceMenu() {
        System.out.println("Enter Valid Menu Choice Again Please!!!");
    }

    static void exitProgram() {
        System.out.println("Exit Program");
        System.exit(0);
    }

    static Scanner scan = new Scanner(System.in);
    public static final String VILLA_FILE_NAME = "Villa";
    public static final String HOUSE_FILE_NAME = "House";
    public static final String ROOM_FILE_NAME = "Room";

    static final String MAIN_MENU = "----------Main Menu----------";
    static final String ADD_NEW_SERVICE = "1. Add New Service";
    static final String SHOW_SERVICES = "2. Show Services";
    static final String ADD_NEW_CUSTOMER = "3. Add New Customer";
    static final String SHOW_INFO_OF_CUSTOMER = "4. Show Information of Customer";
    static final String ADD_NEW_BOOKING = "5. Add New Booking";
    static final String SHOW_INFO_OF_EMPLOYEE = "6. Show Information of Employee";
    static final String BOOKING_MOVIE_TICKET_4D = "7. Booking Movie Ticket 4D";
    static final String FIND_EMPLOYEE = "8. Find Employee";
    static final String EXIT = "9. Exit";

    static final String ADD_NEW_SERVICE_MENU = "----------Add New Service Menu----------";
    static final String ADD_NEW_VILLA = "1. Add New Villa";
    static final String ADD_NEW_HOUSE = "2. Add New House";
    static final String ADD_NEW_ROOM = "3. Add New Room";
    static final String BACK_TO_MENU = "4. Back to menu";

    static final String SHOW_SERVICE_MENU = "----------Show Service Menu----------";
    static final String SHOW_ALL_VILLA = "1. Show all Villa";
    static final String SHOW_ALL_HOUSE = "2. Show all House";
    static final String SHOW_ALL_ROOM = "3. Show all Room";
    static final String SHOW_ALL_NAME_VILLA_NOT_DUPLICATE = "4. Show All Name Villa Not Duplicate";
    static final String SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE = "5. Show All Name House Not Duplicate";
    static final String SHOW_ALL_NAME_ROOM_NOT_DUPLICATE = "6. Show All Name Room Not Duplicate";

    static final String INPUT_DATA_VILLA = "----------Input Data Villa----------";
    static final String INPUT_DATA_HOUSE = "----------Input Data House----------";
    static final String INPUT_DATA_ROOM = "----------Input Data Room----------";
}
