package controllers;

import commons.*;
import models.House;
import models.Room;
import models.Services;
import models.Villa;
import views.ServicesView;

import java.util.List;
import java.util.TreeSet;

public class ServicesController implements DefineConstants {
    static Services services = null;
    static String[] data;

    public static void main(String[] args) {
        addNewService(EntityType.VILLA, VILLA_FILE_NAME);
    }

    public static void getAllInformationService(EntityType serviceType) {
        List<Services> servicesList = ReadFile.getDataFromCsv(serviceType);
        for (Services service : servicesList) {
            ServicesView.displayInformation(service);
        }
    }

    public static void getNameServiceAndRemoveDuplicate(EntityType serviceType) {
        List<Services> servicesList = ReadFile.getDataFromCsv(serviceType);
        TreeSet<String> treeSet = new TreeSet<>();
        for (Services service : servicesList) {
            treeSet.add(service.getServiceName());
        }
        ServicesView.displayInformationNoDuplicate(treeSet);
    }

    public static void commonFields(Services services) {
        scan.nextLine();
        setServiceName(services);
        setUsedArea(services);
        setRentCost(services);
        setMaxQuantityPeople(services);
        setRentType(services);
    }

    public static void addNewService(EntityType service, String fileName) {
        switch (service) {
            case VILLA:
                services = new Villa();
                System.out.println(INPUT_DATA_VILLA);
                services.setId(VILLA_ID_FORMAT + RandomId.generaRandomId());
                commonFields(services);
                setRoomStandardForVilla();
                setDescriptionOtherAmenitiesForVilla();
                setPoolAreaForVilla();
                setFloorNumberForVilla();
                saveVillaDataToCsv(fileName);
                break;
            case HOUSE:
                services = new House();
                System.out.println(INPUT_DATA_HOUSE);
                services.setId(HOUSE_ID_FORMAT + RandomId.generaRandomId());
                commonFields(services);
                setRoomStandardForHouse();
                setDescriptionOtherAmenitiesForHouse();
                setFloorNumberForHouse();
                saveHouseDataToCsv(fileName);
                break;
            case ROOM:
                services = new Room();
                System.out.println(INPUT_DATA_ROOM);
                services.setId(ROOM_ID_FORMAT + RandomId.generaRandomId());
                commonFields(services);
                setFreeServiceIncludedForRoom();
                saveRoomDataToCsv(fileName);
                break;
        }
    }

    private static void saveRoomDataToCsv(String fileName) {
        data = new String[]{services.getId(), services.getServiceName(), services.getUsedArea(), services.getRentCost(), services.getMaxQuantityOfPeople(),
                services.getRenType(), ((Room) services).getFreeServiceIncluded()};
        WriteFile.writeData(fileName, data);
    }

    private static void setFreeServiceIncludedForRoom() {
        do {
            System.out.println(ENTER_FREE_SERVICE_INCLUDED);
            ((Room) services).setFreeServiceIncluded(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(((Room) services).getFreeServiceIncluded()));
    }

    private static void saveHouseDataToCsv(String fileName) {
        data = new String[]{services.getId(), services.getServiceName(), services.getUsedArea(), services.getRentCost(), services.getMaxQuantityOfPeople(),
                services.getRenType(), ((House) services).getRoomStandard(), ((House) services).getDescriptionOtherAmenities(), ((House) services).getFloorNumber()};
        WriteFile.writeData(fileName, data);
    }

    private static void setFloorNumberForHouse() {
        do {
            System.out.println(ENTER_FLOOR_NUMBER);
            ((House) services).setFloorNumber(scan.nextLine());
        } while (!Validation.isPositiveNumber(((House) services).getFloorNumber()));
    }

    private static void setDescriptionOtherAmenitiesForHouse() {
        do {
            System.out.println(ENTER_DESCRIPTION_OTHER_AMENITIES);
            ((House) services).setDescriptionOtherAmenities(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(((House) services).getDescriptionOtherAmenities()));
    }

    private static void setRoomStandardForHouse() {
        do {
            System.out.println(ENTER_ROOM_STANDARD);
            ((House) services).setRoomStandard(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(((House) services).getRoomStandard()));
    }

    private static void saveVillaDataToCsv(String fileName) {
        data = new String[]{services.getId(), services.getServiceName(), services.getUsedArea(), services.getRentCost(), services.getMaxQuantityOfPeople(),
                services.getRenType(), ((Villa) services).getRoomStandard(), ((Villa) services).getDescriptionOtherAmenities(), ((Villa) services).getPoolArea(), ((Villa) services).getFloorNumber()};
        WriteFile.writeData(fileName, data);
    }

    private static void setFloorNumberForVilla() {
        do {
            System.out.println(ENTER_FLOOR_NUMBER);
            ((Villa) services).setFloorNumber(scan.nextLine());
        } while (!Validation.isPositiveNumber(((Villa) services).getFloorNumber()));
    }

    private static void setPoolAreaForVilla() {
        do {
            System.out.println(ENTER_POOL_AREA);
            ((Villa) services).setPoolArea(scan.nextLine());
        } while (!Validation.isUsedArea_PoolArea(((Villa) services).getPoolArea()));
    }

    private static void setDescriptionOtherAmenitiesForVilla() {
        do {
            System.out.println(ENTER_DESCRIPTION_OTHER_AMENITIES);
            ((Villa) services).setDescriptionOtherAmenities(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(((Villa) services).getDescriptionOtherAmenities()));
    }

    private static void setRoomStandardForVilla() {
        do {
            System.out.println(ENTER_ROOM_STANDARD);
            ((Villa) services).setRoomStandard(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(((Villa) services).getRoomStandard()));
    }

    private static void setRentType(Services services) {
        do {
            System.out.println(ENTER_RENT_TYPE);
            services.setRenType(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(services.getRenType()));
    }

    private static void setMaxQuantityPeople(Services services) {
        do {
            System.out.println(ENTER_MAX_QUANTITY_OF_PEOPLE);
            services.setMaxQuantityOfPeople(scan.nextLine());
        } while (!Validation.isMaximumPeople(services.getMaxQuantityOfPeople()));
    }

    private static void setRentCost(Services services) {
        do {
            System.out.println(ENTER_RENT_COST);
            services.setRentCost(scan.nextLine());
        } while (!Validation.isPositiveNumber(services.getRentCost()));
    }

    private static void setUsedArea(Services services) {
        do {
            System.out.println(ENTER_USED_AREA);
            services.setUsedArea(scan.nextLine());
        } while (!Validation.isUsedArea_PoolArea(services.getUsedArea()));
    }

    private static void setServiceName(Services services) {
        do {
            System.out.println(ENTER_SERVICE_NAME);
            services.setServiceName(scan.nextLine());
        } while (!Validation.isFirstLetterUppercase(services.getServiceName()));
    }
}
