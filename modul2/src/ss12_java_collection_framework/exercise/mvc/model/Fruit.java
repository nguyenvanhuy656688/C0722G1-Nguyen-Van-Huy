package ss12_java_collection_framework.exercise.mvc.model;

public class Fruit {
    private String mass;
    private String price;
    private String source;

    public Fruit() {
    }

    public Fruit(String mass, String price, String source) {
        this.mass = mass;
        this.price = price;
        this.source = source;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "mass='" + mass + '\'' +
                ", price='" + price + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
