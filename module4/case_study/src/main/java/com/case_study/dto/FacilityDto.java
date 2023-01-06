package com.case_study.dto;

import com.case_study.model.facility.FacilityType;
import com.case_study.model.facility.RentType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FacilityDto implements Validator {
    private int id;
    @NotEmpty(message = "Không được để trống")
    private String name;
    @NotEmpty(message = "Không được để trống")
    private String area;
    @NotEmpty(message = "Không được để trống")
    private String cost;
    @Size(max = 20,min = 2, message = "nhập tối đa 20 người")
    @NotEmpty(message = "Không được để trống")
    private int maxPeople;
    @Pattern(regexp = "VIP|NORMAL")
    @NotEmpty(message = "Không được để trống")
    private String standardRoom;
    @NotEmpty(message = "Không được để trống")
    private String description;
    @NotEmpty(message = "Không được để trống")
    private String pollArea ;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 5, message = "nhập Tối đã 5 tầng")
    private String numberOfFloor;
    private String facilityFree;
    @ManyToOne
    private RentType rentType;
    @ManyToOne
    private FacilityType facilityType;


    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPollArea() {
        return pollArea;
    }

    public void setPollArea(String pollArea) {
        this.pollArea = pollArea;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
