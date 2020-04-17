package views;

import models.Services;
import models.Villa;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        testVilla();
    }

    static void testVilla() {
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

        scan.nextLine(); // nhận phím enter làm giá trị (fix bug nextInt mà sau nó là nextLine())

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

        System.out.println(villa.showInfo());
    }
}
