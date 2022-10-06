package case_study_furama.model.model_person;

import java.time.LocalDate;

public class Employer extends Person {
    private String idEmployer;
    private String level;
    private String locus;
    private String wage;

    public Employer(String name, LocalDate dayBirth, String gender, String idCard, String numberPhone, String email, String idEmployer, String level, String locus, String wage) {
        super(name, dayBirth, gender, idCard, numberPhone, email);
        this.idEmployer = idEmployer;
        this.level = level;
        this.locus = locus;
        this.wage = wage;
    }

    public Employer(String idEmployer, String level, String locus) {
        this.idEmployer = idEmployer;
        this.level = level;
        this.locus = locus;
    }

    public Employer(String level, String locus) {
        this.level = level;
        this.locus = locus;
    }

    public Employer(){

    }

    public String getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(String idEmployer) {
        this.idEmployer = idEmployer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", level='" + level + '\'' +
                ", locus='" + locus + '\'' +
                ", wage='" + wage + '\'' ;
    }
}
