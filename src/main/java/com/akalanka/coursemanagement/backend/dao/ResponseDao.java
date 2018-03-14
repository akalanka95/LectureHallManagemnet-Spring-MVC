package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.Response;

import java.util.List;

public interface ResponseDao {

    boolean addResponse(Response response);
    List<Response> getlastfive();
    List<Response> getallresponses();
    Response getResponserecived(String code, String received);
    Response getResponsesent(String code,String sent);

}
