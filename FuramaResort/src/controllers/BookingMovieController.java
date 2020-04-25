package controllers;

import commons.ReadFile;
import commons.DefineConstants;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BookingMovieController implements DefineConstants {
    static int ticketHasBeenSold = 0;
    static int totalTickets = 4;
    static int choiceCustomer = 0;
    static int seat = 0;
    static Queue<String> queueCustomerBookingTicket = new LinkedList<>();

    static void bookingTicket() {
        System.out.println(LIST_CUSTOMER);
        CustomerController.showAllCustomerUsingMap();
        System.out.println(TOTAL_TICKETS + totalTickets);
        System.out.println(TICKET_LEFT + (totalTickets - ticketHasBeenSold));

        System.out.println(CHOICE_CUSTOMER_FOR_ORDER);
        choiceCustomer = scan.nextInt();
        choiceCustomer--;
        bookingProcess(choiceCustomer);

    }
    static void bookingProcess(int numberCustomer) {
        List<String> listCustomer = ReadFile.getDataFromCsvFile(CUSTOMER_FILE_NAME);

        if (ticketHasBeenSold < totalTickets) {

            seat+=1;
            queueCustomerBookingTicket.add(SEAT_NUMBER+ seat +listCustomer.get(numberCustomer));
            ticketHasBeenSold++;
            System.out.println(BOOKING_TICKET_SUCCESS);
            System.out.println(TICKET_LEFT + (totalTickets - ticketHasBeenSold));
        }
        if (ticketHasBeenSold == totalTickets) {
            System.out.println(OUT_OF_TICKET);
            System.out.println(CUSTOMER_LIST_BOOKED);
            for (String customer : queueCustomerBookingTicket) {
                System.out.println(customer);
            }
        }

    }

}
