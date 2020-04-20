package models;


public abstract class Services implements DefineConstants{
    private String id;
    private String serviceName;
    private String usedArea;
    private String rentCost;
    private String maxQuantityOfPeople;
    private String renType;

    public Services() {
    }

    public Services(String id, String serviceName, String usedArea, String rentCost, String maxQuantityOfPeople, String renType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usedArea = usedArea;
        this.rentCost = rentCost;
        this.maxQuantityOfPeople = maxQuantityOfPeople;
        this.renType = renType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(String usedArea) {
        this.usedArea = usedArea;
    }

    public String getRentCost() {
        return rentCost;
    }

    public void setRentCost(String rentCost) {
        this.rentCost = rentCost;
    }

    public String getMaxQuantityOfPeople() {
        return maxQuantityOfPeople;
    }

    public void setMaxQuantityOfPeople(String maxQuantityOfPeople) {
        this.maxQuantityOfPeople = maxQuantityOfPeople;
    }

    public String getRenType() {
        return renType;
    }

    public void setRenType(String renType) {
        this.renType = renType;
    }

    public abstract String showInfo();
    public abstract void addNewService();
    public abstract void showAllService();
    public abstract void showServiceNameNotDuplicate();
}
