package com.akalanka.coursemanagement.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "lecture_detail")
public class Lecture {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY	)
        private int id;
        @NotBlank(message = "Please enter the Full Name!")
        private String fullName;
        @NotBlank(message = "Please enter the Address!")
        private String Address;
        @NotBlank(message = "Please enter the Email!")
        @Email
        private String email;
        @NotBlank(message = "Please enter the Contact Number!")
        private String contact;
        @NotBlank(message = "Please enter the Role!")
        private String role;
        @OneToOne
        private Department department;
        private String imageUrl;
        private boolean active;

        @Transient
        private MultipartFile file;


    public Lecture() {
        this.imageUrl = "LCR" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", department='" + department + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}


