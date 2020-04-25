package models;
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
    public String showInfo() {
        countRoom += 1;
        return "Room: " + countRoom + " Id: " + super.getId() +
                " Service Name: " + super.getServiceName() +
                " Used Area: " + super.getUsedArea() +
                " Rent Cost: " + super.getRentCost() +
                " Quantity Of People: " + super.getMaxQuantityOfPeople() +
                " Rent Type: " + super.getRenType() +
                " Room Standard: " + this.getFreeServiceIncluded()
                ;
    }


}
