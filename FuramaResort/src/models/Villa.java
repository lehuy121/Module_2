package models;

import commons.RandomId;
import commons.ReadFile;
import commons.Validation;
import commons.WriteFile;

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
    public void addNewService() {
        scan.nextLine();
        System.out.println(INPUT_DATA_VILLA);
        setId(VILLA_ID_FORMAT + RandomId.generaRandomId());
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

        do {
            System.out.println(ENTER_ROOM_STANDARD);
            setRoomStandard(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(getRoomStandard()));

        do {
            System.out.println(ENTER_DESCRIPTION_OTHER_AMENITIES);
            setDescriptionOtherAmenities(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(getDescriptionOtherAmenities()));

        do {
            System.out.println(ENTER_POOL_AREA);
            setPoolArea(scan.nextLine());
        } while (!Validation.isUsedArea_PoolArea(getPoolArea()));

        do {
            System.out.println(ENTER_FLOOR_NUMBER);
            setFloorNumber(scan.nextLine());
        } while (!Validation.isPositiveNumber(getFloorNumber()));

        String[] data = {getId(), getServiceName(), getUsedArea(), getRentCost(), getMaxQuantityOfPeople(),
                getRenType(), getRoomStandard(), getDescriptionOtherAmenities(), getPoolArea(), getFloorNumber()};
        WriteFile.writeData(VILLA_FILE_NAME, data);

    }

    @Override
    public void showAllService() {
        for (Villa villa : ReadFile.getAllVilla()) {
               System.out.println(villa.showInfo());
            }

    }

    @Override
    public void showServiceNameNotDuplicate() {
        ReadFile.showServiceNameNotDuplicate(VILLA_FILE_NAME);
    }

    @Override
    public String showInfo() {
        countVilla+=1;
        return "Villa: "+countVilla+" Id: " + super.getId() +
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
