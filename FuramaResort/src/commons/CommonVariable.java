package commons;

import java.util.Scanner;

public interface CommonVariable {
     enum ENTITY_TYPE {
        VILLA, HOUSE, ROOM, CUSTOMER, EMPLOYEE
    }
    Scanner scan = new Scanner(System.in);
    String VILLA_ID_FORMAT = "SVVL-";
    String HOUSE_ID_FORMAT = "SVHO-";
    String ROOM_ID_FORMAT = "SVRO-";
    String ENTER_SERVICE_NAME = "Enter Service Name: ";
    String ENTER_USED_AREA = "Enter Used Area: ";
    String ENTER_RENT_COST = "Enter Rent Cost";
    String ENTER_MAX_QUANTITY_OF_PEOPLE = "Enter Max Quantity Of People";
    String ENTER_RENT_TYPE = "Enter Rent Type";
    String ENTER_ROOM_STANDARD = "Enter Room Standard";
    String ENTER_DESCRIPTION_OTHER_AMENITIES = "Enter Description Other Amenities";
    String ENTER_POOL_AREA = "Enter Pool Area";
    String ENTER_FLOOR_NUMBER = "Enter Floor Number";
    String ENTER_FREE_SERVICE_INCLUDED = "Enter Free Service Included";
    String ENTER_CUSTOMER_NAME = "Enter Customer Name";
    String ENTER_CUSTOMER_BIRTH = "Enter Day Of Birth";
    String ENTER_CUSTOMER_GENDER = "Enter Gender";
    String ENTER_CUSTOMER_ID_NUMBER = "Enter Id Number";
    String ENTER_CUSTOMER_PHONE_NUMBER = "Enter Phone Number";
    String ENTER_CUSTOMER_EMAIL = "Enter Email";
    String ENTER_CUSTOMER_TYPE = "Enter Customer Type";
    String ENTER_CUSTOMER_ADDRESS = "Enter Customer Address";


    String VILLA_FILE_NAME = "Villa";
    String HOUSE_FILE_NAME = "House";
    String ROOM_FILE_NAME = "Room";
    String CUSTOMER_FILE_NAME = "Customer";
    String EMPLOYEE_FILE_NAME = "Employee";
    String BOOKING_FILE_NAME = "Booking";

    String MAIN_MENU = "----------Main Menu----------";
    String ADD_NEW_SERVICE = "1. Add New Service";
    String SHOW_SERVICES = "2. Show Services";
    String ADD_NEW_CUSTOMER = "3. Add New Customer";
    String SHOW_INFO_OF_CUSTOMER = "4. Show Information of Customer";
    String ADD_NEW_BOOKING = "5. Add New Booking";
    String SHOW_INFO_OF_EMPLOYEE = "6. Show Information of Employee";
    String BOOKING_MOVIE_TICKET_4D = "7. Booking Movie Ticket 4D";
    String FIND_EMPLOYEE = "8. Find Employee";
    String EXIT = "9. Exit";
    String INVALID_MENU_CHOICE = "Enter Valid Menu Choice Again Please!!!";
    String EXIT_MESSAGE = "Exit program";

    String ADD_NEW_SERVICE_MENU = "----------Add New Service Menu----------";
    String ADD_NEW_VILLA = "1. Add New Villa";
    String ADD_NEW_HOUSE = "2. Add New House";
    String ADD_NEW_ROOM = "3. Add New Room";
    String BACK_TO_MENU = "4. Back to menu";
    String ADD_NEW_SERVICE_MENU_EXIT = "5. Exit Program";

    String SHOW_SERVICE_MENU = "----------Show Service Menu----------";
    String SHOW_ALL_VILLA = "1. Show all Villa";
    String SHOW_ALL_HOUSE = "2. Show all House";
    String SHOW_ALL_ROOM = "3. Show all Room";
    String SHOW_ALL_NAME_VILLA_NOT_DUPLICATE = "4. Show All Name Villa Not Duplicate";
    String SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE = "5. Show All Name House Not Duplicate";
    String SHOW_ALL_NAME_ROOM_NOT_DUPLICATE = "6. Show All Name Room Not Duplicate";
    String SHOW_SERVICE_MENU_BACK_TO_MAIN_MENU = "7. Back to main menu";
    String SHOW_SERVICE_MENU_EXIT_PROGRAM = "8. Exit Program";

    String BOOKING_MENU = "----------Booking Service----------";
    String BOOKING_MENU_BOOKING_VILLA = "1. Booking Villa";
    String BOOKING_MENU_BOOKING_HOUSE = "2. Booking House";
    String BOOKING_MENU_BOOKING_ROOM = "3. Booking Room";
    String BOOKING_MENU_BACK_TO_MAIN_MENU = "4. Back to main menu";
    String CHOICE_CUSTOMER = "Choice Customer";
    String CHOICE_VILLA = "Choice Villa";
    String CHOICE_HOUSE = "Choice House";
    String CHOICE_ROOM = "Choice Room";

    String INPUT_DATA_VILLA = "----------Input Data Villa----------";
    String INPUT_DATA_HOUSE = "----------Input Data House----------";
    String INPUT_DATA_ROOM = "----------Input Data Room----------";
    String INPUT_DATA_CUSTOMER = "----------Input Data Customer----------";

    String BOOKING_MOVIE_TICKET = "----------Booking Movie----------";
    String LIST_CUSTOMER = "----------List Customer-----------";
    String TOTAL_TICKETS = "Total of tickets: ";
    String TICKET_LEFT = "Number of ticket left: ";
    String CHOICE_CUSTOMER_FOR_ORDER = "Choice customer want to booking";
    String SEAT_NUMBER = "Seat number = ";
    String BOOKING_TICKET_SUCCESS = "-----Done!!!-----";
    String OUT_OF_TICKET = "Out of ticket";
    String CUSTOMER_LIST_BOOKED = "Customer list has successfully booked";

    String SEARCH_EMPLOYEE = "----------Search Employee----------";
    String ENTER_EMPLOYEE_NAME = "Enter Employee Name";
    String CAN_NOT_FOUND_EMPLOYEE_NAME = "Not Found";

    int MAIN_MENU_ADD_NEW_SERVICE = 1;
    int MAIN_MENU_SHOW_SERVICE = 2;
    int MAIN_MENU_ADD_NEW_CUSTOMER = 3;
    int MAIN_MENU_SHOW_INFO_CUSTOMER = 4;
    int MAIN_MENU_ADD_NEW_BOOKING = 5;
    int MAIN_MENU_SHOW_INFO_EMPLOYEE = 6;
    int MAIN_MENU_BOOKING_MOVIE_TICKET_4D = 7;
    int MAIN_MENU_FIND_EMPLOYEE = 8;
    int MAIN_MENU_EXIT = 9;

    int MENU_ADD_NEW_SERVICE_VILLA = 1;
    int MENU_ADD_NEW_SERVICE_HOUSE = 2;
    int MENU_ADD_NEW_SERVICE_ROOM = 3;
    int MENU_ADD_NEW_SERVICE_BACK_TO_MAIN_MENU = 4;
    int MENU_ADD_NEW_SERVICE_BACK_EXIT = 5;

    int MENU_SHOW_SERVICE_SHOW_ALL_VILLA = 1;
    int MENU_SHOW_SERVICE_SHOW_ALL_HOUSE = 2;
    int MENU_SHOW_SERVICE_SHOW_ALL_ROOM = 3;
    int MENU_SHOW_SERVICE_SHOW_ALL_NAME_VILLA_NOT_DUPLICATE = 4;
    int MENU_SHOW_SERVICE_SHOW_ALL_NAME_HOUSE_NOT_DUPLICATE = 5;
    int MENU_SHOW_SERVICE_SHOW_ALL_NAME_ROM_NOT_DUPLICATE = 6;
    int MENU_SHOW_SERVICE_BACK_TO_MAIN_MENU = 7;
    int MENU_SHOW_SERVICE_EXIT = 8;
    int MENU_BOOKING_BOOKING_VILA = 1;
    int MENU_BOOKING_BOOKING_HOUSE = 2;
    int MENU_BOOKING_BOOKING_ROOM = 3;
    int MENU_BOOKING_BACK_TO_MAIN_MENU = 4;
}
