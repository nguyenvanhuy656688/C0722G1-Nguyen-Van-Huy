package mvc2.model;

import java.util.List;

public class Truck extends Car{
    private String tonnage;

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(int seaControl, List manufacturer, int yearManufacture, String owner, String tonnage) {
        super(seaControl, manufacturer, yearManufacture, owner);
        this.tonnage = tonnage;
    }

    public Truck(){}

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage='" + tonnage + '\'' +
                super.toString()+
                '}';
    }
}
