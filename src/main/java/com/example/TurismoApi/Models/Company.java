package com.example.TurismoApi.Models;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nit;
    private String name;
    private String location;
    protected final Double anualCost = 120000d;
    protected final Double monthlyCost = 70000d;


    public Company(Integer id, String nit, String name, String location) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getAnualCost() {
        return anualCost;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }
}
