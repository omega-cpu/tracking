package com.example.trails.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Capital {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Cname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Capital(int id, String cname) {
        this.id = id;
        Cname = cname;
    }

    public Capital() {
    }

    @Override
    public String toString() {
        return "Capital [Cname=" + Cname + ", id=" + id + "]";
    }
}