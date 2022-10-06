package case_study_furama.model.model_facility;

public class House extends Facility {
    private String standardRoom;
    private String floorsNumber;

    public House(String codeService,String nameService, Double areaUsable, Integer costRental, Integer maximumPeople, String typeRental, String standardRoom, String floorsNumber) {
        super(codeService,nameService, areaUsable, costRental, maximumPeople, typeRental);
        this.standardRoom = standardRoom;
        this.floorsNumber = floorsNumber;
    }

    public House(String standardRoom, String floorsNumber) {
        this.standardRoom = standardRoom;
        this.floorsNumber = floorsNumber;
    }

    public House(){

    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(String floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", floorsNumber='" + floorsNumber + '\'' +
                super.toString() + '\'' +
                '}';
    }
}
