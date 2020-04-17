package models;

public class Room extends Services {
    private String freeServiceIncluded;


    public Room() {
    }

    public Room(String id, String serviceName, double usedArea, double rentCost, int maxQuantityOfPeople, String renType, String freeServiceIncluded) {
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
        return "\n Id Server: " + super.getId() +
                "\n Service Name: " + super.getServiceName() +
                "\n Used Area: " + super.getUsedArea() +
                "\n Rent Cost: " + super.getRentCost() +
                "\n Quantity Of People: " + super.getMaxQuantityOfPeople() +
                "\n Rent Type: " + super.getRenType() +
                "\n Room Standard: " + this.getFreeServiceIncluded()
                ;
    }
}
