package controllers;

import commons.ReadFile;
import models.Customer;
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
    static Customer customer = new Customer();

    static void bookingProcess(int numberCustomer) {
        List<String> listCustomer = ReadFile.getDataFromCsvFile("Customer");

        if (ticketHasBeenSold < totalTickets) {

            seat+=1;
            queueCustomerBookingTicket.add("Seat number = "+ seat +listCustomer.get(numberCustomer));
            ticketHasBeenSold++;
            System.out.println("-----Done!!!-----");
            System.out.println("Number of ticket left: " + (totalTickets - ticketHasBeenSold));
        }
        if (ticketHasBeenSold == totalTickets) {
            System.out.println("Out of ticket");
            System.out.println("List of the customer ordered a ticket");
            for (String customer : queueCustomerBookingTicket) {
                System.out.println(customer);
            }
        }

    }

    static void bookingMovieTicket4D() {
        System.out.println("----------List Customer-----------");
        CustomerController.showAllCustomerUsingMap();
        System.out.println("Total of tickets: " + totalTickets);
        System.out.println("Number of ticket left: " + (totalTickets - ticketHasBeenSold));

        System.out.println("Choice customer want to order");
        choiceCustomer = scan.nextInt();
        choiceCustomer--;
        bookingProcess(choiceCustomer);

    }

}
