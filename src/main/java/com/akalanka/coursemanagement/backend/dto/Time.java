package com.akalanka.coursemanagement.backend.dto;


import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "time_details")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    private LocalTime time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
