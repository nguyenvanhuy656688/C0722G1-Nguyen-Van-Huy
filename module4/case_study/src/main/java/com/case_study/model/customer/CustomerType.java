package com.case_study.model.customer;

import jakarta.persistence.*;


@Entity
public class CustomerType {
    @Id
    private int id;
    private String name;


    public CustomerType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerType() {
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
}
