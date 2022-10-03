package case_study_furama.model.model_facility;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService, String areaUsable, Integer costRental, Integer maximumPeople, String typeRental, String freeService) {
        super(nameService, areaUsable, costRental, maximumPeople, typeRental);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(){}

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                super.toString()+'\''+
                '}';
    }
}
