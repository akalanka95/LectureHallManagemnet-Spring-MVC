package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.LectureHallDao;
import com.akalanka.coursemanagement.backend.dto.LectureHall;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;

public class LectureHallTestCase {

    private static AnnotationConfigApplicationContext context;
    private static LectureHallDao lectureHallDao;
    private LectureHall lectureHall;


    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        lectureHallDao = (LectureHallDao) context.getBean("lectureHallDao");

    }
    @Test
    public void addLectureHall() {

        /*lectureHall = new LectureHall();

        lectureHall.setCode("LTD");
        lectureHall.setDescription("This is regarding cis");
        lectureHall.setName("LTD");
        lectureHall.setCapacity(50);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));*/

        lectureHall = new LectureHall();

        lectureHall.setCode("CIS Lab");
        lectureHall.setDescription("CIS Computer Laboratory");
        lectureHall.setName("CIS Lab");
        lectureHall.setCapacity(80);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));



        lectureHall = new LectureHall();

        lectureHall.setCode("NLH");
        lectureHall.setDescription("New lecture hall");
        lectureHall.setName("NLH");
        lectureHall.setCapacity(100);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));




        lectureHall = new LectureHall();

        lectureHall.setCode("ELTD");
        lectureHall.setDescription("Confortable lecture hall");
        lectureHall.setName("ELTD");
        lectureHall.setCapacity(70);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));



        lectureHall = new LectureHall();

        lectureHall.setCode("Z-9");
        lectureHall.setDescription("Old lecture hall");
        lectureHall.setName("Z-9");
        lectureHall.setCapacity(75);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));



        lectureHall = new LectureHall();

        lectureHall.setCode("PST Lab");
        lectureHall.setDescription("PST computer laboratory");
        lectureHall.setName("PST Lab");
        lectureHall.setCapacity(50);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));


        lectureHall = new LectureHall();

        lectureHall.setCode("LT-202");
        lectureHall.setDescription("A lecture hall inside the faculty");
        lectureHall.setName("LT-202");
        lectureHall.setCapacity(50);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));



        lectureHall = new LectureHall();

        lectureHall.setCode("LT-104");
        lectureHall.setDescription("A specific lecture hall in the faculty");
        lectureHall.setName("LT-104");
        lectureHall.setCapacity(150);

        assertEquals("Added successfully", true, lectureHallDao.addLectureHall(lectureHall));



    }

}
