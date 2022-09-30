package ss17_io_binary.exercise.product.model;

public class Product {
    private Integer code;
    private String name;
    private String manufacturer;
    private Integer price;

    public Product(Integer code, String name, String manufacturer, Integer price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Product() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
//        return String.format("%s,%s,%s,%s",this.code,this.name,this.manufacturer,this.price);
        return this.getCode()+","+this.getName()+","+this.getManufacturer()+","+this.getPrice();
    }
}
