package com.example.TurismoApi.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tittle;
    private String description;
    private LocalDate startDay;
    private LocalDate endDay;
    private Double costPerPerson;

    public Offer(){

    }

    public Offer(Integer id, String tittle, String description, LocalDate startDay, LocalDate endDay, Double costPerPerson) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.startDay = startDay;
        this.endDay = endDay;
        this.costPerPerson = costPerPerson;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public Double getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(Double costPerPerson) {
        this.costPerPerson = costPerPerson;
    }
}
