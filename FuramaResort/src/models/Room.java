package models;

import commons.RandomId;
import commons.ReadFile;
import commons.Validation;
import commons.WriteFile;

public class Room extends Services {
    private String freeServiceIncluded;
    private static int countRoom;


    public Room() {
    }

    public Room(String id, String serviceName, String usedArea, String rentCost, String maxQuantityOfPeople, String renType, String freeServiceIncluded) {
        super(id, serviceName, usedArea, rentCost, maxQuantityOfPeople, renType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public void addNewService() {
        scan.nextLine();
        System.out.println(INPUT_DATA_ROOM);

        setId(ROOM_ID_FORMAT + RandomId.generaRandomId());
        do {
            System.out.println(ENTER_SERVICE_NAME);
            setServiceName(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(getServiceName()));

        do {
            System.out.println(ENTER_USED_AREA);
            setUsedArea(scan.nextLine());
        } while (!Validation.isUsedArea_PoolArea(getUsedArea()));

        do {
            System.out.println(ENTER_RENT_COST);
            setRentCost(scan.nextLine());
        } while (!Validation.isPositiveNumber(getRentCost()));

        do {
            System.out.println(ENTER_MAX_QUANTITY_OF_PEOPLE);
            setMaxQuantityOfPeople(scan.nextLine());
        } while (!Validation.isMaximumPeople(getMaxQuantityOfPeople()));

        do {
            System.out.println(ENTER_RENT_TYPE);
            setRenType(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(getRenType()));

        do{
            System.out.println(ENTER_FREE_SERVICE_INCLUDED);
            setFreeServiceIncluded(scan.nextLine());
        }while(!Validation.isFirstLetterUppercase(getFreeServiceIncluded()));

        String[] data = {getId(), getServiceName(), getUsedArea(), getRentCost(), getMaxQuantityOfPeople(),
                getRenType(), getFreeServiceIncluded()};
        WriteFile.writeData(ROOM_FILE_NAME, data);

    }

    @Override
    public void showAllService() {
        for (Room room : ReadFile.getAllRoom()) {
            System.out.println(room.showInfo());
        }

    }

    @Override
    public void showServiceNameNotDuplicate() {
        ReadFile.showServiceNameNotDuplicate(ROOM_FILE_NAME);
    }

    @Override
    public String showInfo() {
        countRoom+=1;
        return "Room: "+countRoom+" Id: " + super.getId() +
                " Service Name: " + super.getServiceName() +
                " Used Area: " + super.getUsedArea() +
                " Rent Cost: " + super.getRentCost() +
                " Quantity Of People: " + super.getMaxQuantityOfPeople() +
                " Rent Type: " + super.getRenType() +
                " Room Standard: " + this.getFreeServiceIncluded()
                ;
    }


}
