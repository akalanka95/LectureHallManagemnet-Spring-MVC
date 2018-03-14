package com.akalanka.coursemanagement.backend.daoImp;


import com.akalanka.coursemanagement.backend.dao.LectureDao;
import com.akalanka.coursemanagement.backend.dto.Lecture;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;


@Repository("lectureDao")
@Transactional
public class LectureDaoImp implements LectureDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addLecture(Lecture lecture) {
        try {
            sessionFactory.getCurrentSession().persist(lecture);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean updateLecture(Lecture lecture) {
        try {
            sessionFactory.getCurrentSession().update(lecture);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteLecture(Lecture lecture) {
        try {
            sessionFactory.getCurrentSession().delete(lecture);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Lecture get(int id) {
        return sessionFactory.getCurrentSession().get(Lecture.class, Integer.valueOf(id));
    }

    @Override
    public Lecture getfromcontactnumber(String contact) {
        String selectProductsList = "From Lecture WHERE contact= :contact";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("contact",contact);
        return (Lecture) query.getSingleResult();
    }


    @Override
    public List<Lecture> lectureList() {
        String selectProductsList = "From Lecture ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        return query.getResultList();
    }
}
