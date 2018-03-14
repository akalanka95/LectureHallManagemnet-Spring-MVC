package com.akalanka.coursemanagement.backend.dto;

import javax.persistence.*;

@Entity
@Table(name = "department_detail")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    private String departmentName;
    private String description;
    private boolean active;


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
