package com.rest.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by billaros on 9/10/2016.
 */
@Entity
@Table(name = "Wod")
public class Wod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description",length = 2000)
    private String description;
    private Date date;
    private int capacity;
    private float finalTime;
    private String type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(float finalTime) {
        this.finalTime = finalTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wod{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", capacity=" + capacity +
                ", finalTime=" + finalTime +
                ", type='" + type + '\'' +
                '}';
    }
}
