package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.TimeDao;
import com.akalanka.coursemanagement.backend.dto.Time;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class TimeTestCase {

    private static AnnotationConfigApplicationContext context;
    private static TimeDao timeDao;
    private Time time;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        timeDao = (TimeDao) context.getBean("timeDao");
    }

    @Test
    public void addTime() {

        Time time18 = new Time();
        time18.setTime(LocalTime.of(8, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time18));
        Time time19 = new Time();
        time19.setTime(LocalTime.of(8, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time19));
        Time time20 = new Time();
        time20.setTime(LocalTime.of(9, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time20));
        Time time21 = new Time();
        time21.setTime(LocalTime.of(9, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time21));

        Time time = new Time();
        time.setTime(LocalTime.of(10, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time));
        Time time1 = new Time();
        time1.setTime(LocalTime.of(10, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time1));
        Time time2 = new Time();
        time2.setTime(LocalTime.of(11, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time2));
        Time time3 = new Time();
        time3.setTime(LocalTime.of(11, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time3));
        Time time4 = new Time();
        time4.setTime(LocalTime.of(12, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time4));
        Time time5 = new Time();
        time5.setTime(LocalTime.of(12, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time5));
        Time time6 = new Time();
        time6.setTime(LocalTime.of(13, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time6));
        Time time7 = new Time();
        time7.setTime(LocalTime.of(13, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time7));
        Time time8 = new Time();
        time8.setTime(LocalTime.of(14, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time8));
        Time time9 = new Time();
        time9.setTime(LocalTime.of(14, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time9));
        Time time10 = new Time();
        time10.setTime(LocalTime.of(15, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time10));
        Time time11 = new Time();
        time11.setTime(LocalTime.of(15, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time11));
        Time time12 = new Time();
        time12.setTime(LocalTime.of(16, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time12));
        Time time13 = new Time();
        time13.setTime(LocalTime.of(16, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time13));
        Time time14 = new Time();
        time14.setTime(LocalTime.of(17, 00));
        assertEquals("Added successfully", true, timeDao.addTime(time14));
        Time time15 = new Time();
        time15.setTime(LocalTime.of(17, 30));
        assertEquals("Added successfully", true, timeDao.addTime(time15));

    }
}