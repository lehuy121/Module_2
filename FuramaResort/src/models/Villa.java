package models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionOtherAmenities;
    private double poolArea;
    private int floorNumber;


    public Villa() {

    }

    public Villa(String id, String serviceName, double usedArea, double rentCost, int maxQuantityOfPeople, String renType, String roomStandard, String descriptionOtherAmenities, double poolArea, int floorNumber) {
        super(id, serviceName, usedArea, rentCost, maxQuantityOfPeople, renType);
        this.roomStandard = roomStandard;
        this.descriptionOtherAmenities = descriptionOtherAmenities;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionOtherAmenities() {
        return descriptionOtherAmenities;
    }

    public void setDescriptionOtherAmenities(String descriptionOtherAmenities) {
        this.descriptionOtherAmenities = descriptionOtherAmenities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfo() {
        return "Id Service: " + super.getId() +
                ", Service Name: " + super.getServiceName() +
                ", Used Area: " + super.getUsedArea() +
                ", Rent Cost: " + super.getRentCost() +
                ", Quantity Of People: " + super.getMaxQuantityOfPeople() +
                ", Rent Type: " + super.getRenType() +
                ", Room Standard: " + this.getRoomStandard() +
                ", Description Other Amenities: " + this.getDescriptionOtherAmenities() +
                ", Pool Area: " + this.getPoolArea() +
                ", Floor Number: " + this.getFloorNumber();
    }

}
