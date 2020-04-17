package models;

public abstract class Services implements ServiceIncluded {
    private String id;
    private String serviceName;
    private double usedArea;
    private double rentCost;
    private int maxQuantityOfPeople;
    private String renType;

    public Services() {
    }

    public Services(String id, String serviceName, double usedArea, double rentCost, int maxQuantityOfPeople, String renType) {
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

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxQuantityOfPeople() {
        return maxQuantityOfPeople;
    }

    public void setMaxQuantityOfPeople(int maxQuantityOfPeople) {
        this.maxQuantityOfPeople = maxQuantityOfPeople;
    }

    public String getRenType() {
        return renType;
    }

    public void setRenType(String renType) {
        this.renType = renType;
    }

    public abstract String showInfo();
}
