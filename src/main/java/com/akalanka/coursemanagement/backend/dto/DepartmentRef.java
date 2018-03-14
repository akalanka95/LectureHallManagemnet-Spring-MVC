package com.akalanka.coursemanagement.backend.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "departmentRef_detail")
public class DepartmentRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    @NotBlank(message = "Please enter the Full Name!")
    private String name;
    @NotBlank(message = "Please enter the Address!")
    private String address;
    @NotBlank(message = "Please enter the Email!")
    @Email
    private String email;
    @NotBlank(message = "Please enter the Contact Number!")
    private String contact;

    private int department;
    private int semester;
    private String imageUrl;
    private boolean active;

    @Transient
    private MultipartFile file;



    public DepartmentRef() {
        this.imageUrl = "REF" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }


    @Override
    public String toString() {
        return "DepartmentRef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", department=" + department +
                ", imageUrl='" + imageUrl + '\'' +
                ", active=" + active +
                '}';
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
