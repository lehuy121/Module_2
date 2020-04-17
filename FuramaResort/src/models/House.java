package models;

public class House extends Services {
    private String roomStandard;
    private String descriptionOtherAmenities;
    private int floorNumber;

    public House() {
    }

    public House(String id, String serviceName, double usedArea, double rentCost, int maxQuantityOfPeople, String renType, String roomStandard, String descriptionOtherAmenities, int floorNumber) {
        super(id, serviceName, usedArea, rentCost, maxQuantityOfPeople, renType);
        this.roomStandard = roomStandard;
        this.descriptionOtherAmenities = descriptionOtherAmenities;
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfo() {
        return "\n Id Server: " + super.getId() +
                "\n Service Name: " + super.getServiceName() +
                "\n Used Area: " + super.getUsedArea() +
                "\n Rent Cost: " + super.getRentCost() +
                "\n Quantity Of People: " + super.getMaxQuantityOfPeople() +
                "\n Rent Type: " + super.getRenType() +
                "\n Room Standard: " + this.getRoomStandard() +
                "\n Description Other Amenities: " + this.getDescriptionOtherAmenities() +
                "\n Floor Number: " + this.getFloorNumber()
                ;
    }
}
