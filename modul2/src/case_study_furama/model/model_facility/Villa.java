package case_study_furama.model.model_facility;

public class Villa extends Facility {
    private  Integer standardRoom;
    private Integer areaPool;
    private Integer floorNumber;


    public Villa(Integer standardRoom, Integer areaPool, Integer floorNumber) {
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floorNumber = floorNumber;
    }

    public Villa() {
    }

    public Integer getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(Integer standardRoom) {
        this.standardRoom = standardRoom;
    }

    public Integer getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Integer areaPool) {
        this.areaPool = areaPool;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom=" + standardRoom +
                ", areaPool=" + areaPool +
                ", floorNumber=" + floorNumber +
                super.toString()+
                '}';
    }
}
