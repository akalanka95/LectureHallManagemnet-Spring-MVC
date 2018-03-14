package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.ResponseDao;
import com.akalanka.coursemanagement.backend.dto.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class ResponseTestCase {

    private static AnnotationConfigApplicationContext context;
    private static ResponseDao responseDao;

    private Response response;

    @BeforeClass
    public static void init() {

        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        responseDao = (ResponseDao) context.getBean("responseDao");

    }

    @Test
    public void addResponse() {

        response = new Response();
        response.setMessageBody("haii");
        response.setSendDate("1234");
        response.setFrommessage("1234");
        response.setLectureName("pulasthi");
        response.setDay("Monday");
        response.setImageUrl("12345");

        assertEquals("Added successfully", true, responseDao.addResponse(response));
    }


    }
