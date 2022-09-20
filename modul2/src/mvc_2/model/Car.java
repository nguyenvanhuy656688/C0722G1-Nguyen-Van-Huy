package mvc2.model;

import java.util.List;

public class Car {
    private int seaControl;
    private List manufacturer;
    private int yearManufacture;
    private String Owner;

    public Car() {
    }

    public Car(int seaControl, List manufacturer, int yearManufacture, String owner) {
        this.seaControl = seaControl;
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        Owner = owner;
    }

    public int getSeaControl() {
        return seaControl;
    }

    public void setSeaControl(int seaControl) {
        this.seaControl = seaControl;
    }

    public List getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seaControl=" + seaControl +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", Owner='" + Owner + '\'' +
                '}';
    }
}