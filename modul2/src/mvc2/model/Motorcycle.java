package mvc2.model;

import java.util.List;

public class Motorcycle extends Car {
    private String wattage;

    public Motorcycle() {
    }

    public Motorcycle(int seaControl, List manufacturer, int yearManufacture, String owner, String wattage) {
        super(seaControl, manufacturer, yearManufacture, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage='" + wattage + '\'' +
                super.toString() +
                '}';
    }
}
