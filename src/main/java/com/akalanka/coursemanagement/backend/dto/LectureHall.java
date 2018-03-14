package com.akalanka.coursemanagement.backend.dto;


import javax.persistence.*;

@Entity
@Table (name = "lectureHall_details")
public class LectureHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    private String Name;
    private String code;
    private String description;
    private int capacity;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
