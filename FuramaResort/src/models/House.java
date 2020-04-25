package models;
public class House extends Services {
    private String roomStandard;
    private String descriptionOtherAmenities;
    private String floorNumber;
    private static int countHouse;

    public House() {
    }

    public House(String id, String serviceName, String usedArea, String rentCost, String maxQuantityOfPeople, String renType, String roomStandard, String descriptionOtherAmenities, String floorNumber) {
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

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfo() {
        countHouse+=1;
        return ""+countHouse+" Id: " + super.getId() +
                " Service Name: " + super.getServiceName() +
                " Used Area: " + super.getUsedArea() +
                " Rent Cost: " + super.getRentCost() +
                " Quantity Of People: " + super.getMaxQuantityOfPeople() +
                " Rent Type: " + super.getRenType() +
                " Room Standard: " + this.getRoomStandard() +
                " Description Other Amenities: " + this.getDescriptionOtherAmenities() +
                " Floor Number: " + this.getFloorNumber()
                ;
    }


}
