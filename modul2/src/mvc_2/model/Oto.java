package mvc2.model;

import java.util.List;

public class Oto extends Car {
    private int numberSeats;
    private String type;

    public Oto(int numberSeats, String type) {
        this.numberSeats = numberSeats;
        this.type = type;
    }

    public Oto(int seaControl, List manufacturer, int yearManufacture, String owner, int numberSeats, String type) {
        super(seaControl, manufacturer, yearManufacture, owner);
        this.numberSeats = numberSeats;
        this.type = type;
    }
    public  Oto(){

    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "numberSeats=" + numberSeats +
                ", type='" + type + '\'' +
                super.toString()+
                '}';
    }
}
