package controllers;

public class Country {
    private int id;
    private String code;
    private String nameT;

    public Country() {
        super();
    }

    public Country(int id, String code, String name) {
        super();
        this.id = id;
        this.code = code;
        this.nameT = name;
    }

    @Override
    public String toString() {
        return "Country [id: " + id + ", code: " + code + ", name: " + nameT + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameT() {
        return nameT;
    }

    public void setNameT(String nameT) {
        this.nameT = nameT;
    }
}
