package models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionOtherAmenities;
    private String poolArea;
    private String floorNumber;
    private static int countVilla;

    public Villa() {
    }

    public Villa(String id, String serviceName, String usedArea, String rentCost, String maxQuantityOfPeople, String renType, String roomStandard, String descriptionOtherAmenities, String poolArea, String floorNumber) {
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfo() {
        countVilla += 1;
        return "Villa: " + countVilla + " Id: " + super.getId() +
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
