package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.TimeTableDao;
import com.akalanka.coursemanagement.backend.dto.LectureHall;
import com.akalanka.coursemanagement.backend.dto.TimeTable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Boolean.FALSE;

@Repository("timeTableDao")
@Transactional
public class TimeTableDaoImp implements TimeTableDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addTimeTable(TimeTable timeTable) {
        try {
            sessionFactory.getCurrentSession().persist(timeTable);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TimeTable> getMondayTimeTableList(int depid,int semid) {
        String selectProductsList = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND active= :true ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("day","Monday");
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getTuesdayTimeTableList(int depid, int semid) {
        String selectProductsList = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("day","Tuesday");
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getWednesdayTimeTableList(int depid, int semid) {
        String selectProductsList = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("day","Wednesday");
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getThursdayTimeTableList(int depid, int semid) {
        String selectProductsList = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("day","Thursday");
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getFridayTimeTableList(int depid, int semid) {
        String selectProductsList = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("day","Friday");
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getLectureHallsList(String day) {
        String selectLectureHallList = "From TimeTable WHERE day= :day AND active= :true ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectLectureHallList);
        query.setParameter("day",day);
        query.setParameter("true",true);
        return query.getResultList();
    }




    public Map<LectureHall, List<TimeTable>> getLectureHallsList2(String day) {
        String selectLectureHallList = "From TimeTable WHERE day= :day ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectLectureHallList);
        query.setParameter("day",day);
        List<TimeTable> time = query.getResultList();
        Map<LectureHall, List<TimeTable>> byHall = time.stream().collect(
                Collectors.groupingBy(TimeTable::getLectureHall));
        return byHall;
    }

    @Override
    public List<TimeTable> getDepTimeTable(String day, int depid, int semid) {
        String selectDepTimeTable = "From TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid ANd active= :true ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepTimeTable);
        query.setParameter("day",day);
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getDateLectureHalls(String day, int lechallid) {
        String selectDateLectureHalls = "From TimeTable WHERE day= :day AND lectureHall_id= :lechallid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLectureHalls);
        query.setParameter("day",day);
        query.setParameter("lechallid",lechallid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getDateLecture(String day, int lecid) {
        String selectDateLecture = "From TimeTable WHERE day= :day AND lecture_id= :lecid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
        query.setParameter("day",day);
        query.setParameter("lecid",lecid);
        query.setParameter("true",true);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getlecturedayid(String day,int id) {
           String selectDateLecture = "FROM TimeTable WHERE day= :day AND lecture_id= :id " ;
           Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
           query.setParameter("day", day);
           query.setParameter("id", id);
           return query.getResultList();
    }

    @Override
    public List<TimeTable> getlecturedayonlyid(int id) {
        String selectDateLecture = "FROM TimeTable WHERE  lecture_id= :id " ;
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> cancellecture(String day, int depid, int semid, int courseid, int starttimeid) {
        String selectDateLecture = "FROM TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND course_id= :courseid AND starttime_id= :starttimeid" ;
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
        query.setParameter("day", day);
        query.setParameter("depid", depid);
        query.setParameter("semid", semid);
        query.setParameter("courseid",courseid);
        query.setParameter("starttimeid", starttimeid);
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getstatenewlecture() {
        String selectDateLecture = "FROM TimeTable WHERE state= :state " ;
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
        query.setParameter("state", "new");
        return query.getResultList();
    }

    @Override
    public List<TimeTable> getTimeTableList() {
        String selectTimeTableList = "FROM TimeTable" ;
        Query query = sessionFactory.getCurrentSession().createQuery(selectTimeTableList);
        return query.getResultList();
    }

    @Override
    public TimeTable getuniqueresult(String day, int depid, int semid, int courseid, int starttimeid) {
        String selectDateLecture = "FROM TimeTable WHERE day= :day AND department_id= :depid AND semester_id= :semid AND course_id= :courseid AND starttime_id= :starttimeid" ;
        Query query = sessionFactory.getCurrentSession().createQuery(selectDateLecture);
        query.setParameter("day", day);
        query.setParameter("depid", depid);
        query.setParameter("semid", semid);
        query.setParameter("courseid",courseid);
        query.setParameter("starttimeid", starttimeid);
        return (TimeTable) query.getSingleResult();
    }

    @Override
    public boolean delete(TimeTable timeTable) {
        try {
            sessionFactory.getCurrentSession().delete(timeTable);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatetimetablelectureday(TimeTable timeTable){
        try {
            sessionFactory.getCurrentSession().update(timeTable);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
