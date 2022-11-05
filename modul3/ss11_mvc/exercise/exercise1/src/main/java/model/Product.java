package model;

public class Product {
    private String name;
    private String price;
    private String type;
    private String unit;
    private String size;

    public Product() {
    }

    public Product(String name, String price, String type, String unit, String size) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.unit = unit;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
