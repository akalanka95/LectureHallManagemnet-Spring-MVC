package com.akalanka.coursemanagement.backend.dto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "message_details")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    private String messageBody;
    private String sendDate;
    private String frommessage;
    private String lectureName;
    private String day;
    private String imageUrl;
    private String state;
    private String code;


    public Response() {
        this.code = "COD" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getFrommessage() {
        return frommessage;
    }

    public void setFrommessage(String frommessage) {
        this.frommessage = frommessage;
    }
}
