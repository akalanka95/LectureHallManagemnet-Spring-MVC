package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.LectureHall;
import com.akalanka.coursemanagement.backend.dto.TimeTable;

import java.util.List;
import java.util.Map;

public interface TimeTableDao {

    boolean addTimeTable(TimeTable timeTable);
    List<TimeTable> getMondayTimeTableList(int depid,int semid);
    List<TimeTable> getTuesdayTimeTableList(int depid,int semid);
    List<TimeTable> getWednesdayTimeTableList(int depid,int semid);
    List<TimeTable> getThursdayTimeTableList(int depid,int semid);
    List<TimeTable> getFridayTimeTableList(int depid,int semid);

    List<TimeTable> getLectureHallsList(String day);
    //List<TimeTable> getLecturescedukeList(String day);


    List<TimeTable> getDepTimeTable(String day,int depid,int semid);
    List<TimeTable> getDateLectureHalls(String day,int lechallid);
    List<TimeTable> getDateLecture(String day,int lecid);

    List<TimeTable> getlecturedayid(String day,int id);
    List<TimeTable> getlecturedayonlyid(int id);
    List<TimeTable> cancellecture(String day,int depid,int semid,int coursid,int starttimeid);
    List<TimeTable> getstatenewlecture();
    List<TimeTable> getTimeTableList();

    TimeTable getuniqueresult(String day,int depid,int semid,int coursid,int starttimeid);

    boolean delete(TimeTable timeTable);
    boolean updatetimetablelectureday(TimeTable timeTable);

}
