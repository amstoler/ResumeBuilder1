package com.example.demo;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=1)
    private String name;

    @NotNull
    @Size(min=3) //only 3 chars necessary. Email has 3 parts name@domain
    private String email;

    @NotNull
    @Size(min=10)
    private String educationA;

    @NotNull
    @Size(min=5)
    private String educationB;

    @NotNull
    @Size(min=5)
    private String educationC;

    @NotNull
    @Size(min=5)
    private String experienceA;

    @NotNull
    @Size(min=5)
    private String experienceB;

    @NotNull
    @Size(min=5)
    private String experienceC;

    @NotNull
    @Range(min = 1, max=5)
    private String orginization;

    @NotNull
    @Range(min = 1, max=5)
    private String timeManagement;

    @NotNull
    @Range(min = 1, max=5)
    private String communication;


    public Resume() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeManagement() {
        return timeManagement;
    }

    public void setTimeManagement(String timeManagement) {
        this.timeManagement = timeManagement;
    }

    public String getOrginization() {
        return orginization;
    }

    public void setOrginization(String orginization) {
        this.orginization = orginization;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getExperienceA() {
        return experienceA;
    }

    public void setExperienceA(String experienceA) {
        this.experienceA = experienceA;
    }

    public String getExperienceB() {
        return experienceB;
    }

    public void setExperienceB(String experienceB) {
        this.experienceB = experienceB;
    }

    public String getExperienceC() {
        return experienceC;
    }

    public void setExperienceC(String experienceC) {
        this.experienceC = experienceC;
    }

    public String getEducationA() {
        return educationA;
    }

    public void setEducationA(String educationA) {
        this.educationA = educationA;
    }

    public String getEducationB() {
        return educationB;
    }

    public void setEducationB(String educationB) {
        this.educationB = educationB;
    }

    public String getEducationC() {
        return educationC;
    }

    public void setEducationC(String educationC) {
        this.educationC = educationC;
    }
}
