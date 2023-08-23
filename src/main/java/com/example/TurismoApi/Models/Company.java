package com.example.TurismoApi.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
}
