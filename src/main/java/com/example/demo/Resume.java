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
    @Size(min=5)
    private String education;

    @NotNull
    @Size(min=5)
    private String experience;

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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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
}
