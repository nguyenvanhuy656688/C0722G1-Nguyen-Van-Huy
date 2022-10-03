package case_study_furama.model.model_facility;

public class Facility {
    private String nameService;
    private String areaUsable;
    private Integer costRental;
    private Integer maximumPeople;
    private String typeRental;

    public Facility(String nameService, String areaUsable, Integer costRental, Integer maximumPeople, String typeRental) {
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.costRental = costRental;
        this.maximumPeople = maximumPeople;
        this.typeRental = typeRental;
    }

    public Facility() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(String areaUsable) {
        this.areaUsable = areaUsable;
    }

    public Integer getCostRental() {
        return costRental;
    }

    public void setCostRental(Integer costRental) {
        this.costRental = costRental;
    }

    public Integer getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(Integer maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUsable='" + areaUsable + '\'' +
                ", costRental=" + costRental +
                ", maximumPeople=" + maximumPeople +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}
