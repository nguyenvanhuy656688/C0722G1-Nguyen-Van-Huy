package case_study_furama.model.model_facility;

public class Facility {
    private String codeService;
    private String nameService;
    private Double areaUsable;
    private Integer costRental;
    private Integer maximumPeople;
    private String typeRental;

    public Facility(String codeService,String nameService, Double areaUsable, Integer costRental, Integer maximumPeople, String typeRental) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.costRental = costRental;
        this.maximumPeople = maximumPeople;
        this.typeRental = typeRental;
    }

    public Facility() {
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(Double areaUsable) {
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
                "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsable=" + areaUsable +
                ", costRental=" + costRental +
                ", maximumPeople=" + maximumPeople +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}
