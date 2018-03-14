package com.akalanka.coursemanagement.backend.daoImp;


import com.akalanka.coursemanagement.backend.dao.LectureHallDao;
import com.akalanka.coursemanagement.backend.dto.LectureHall;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("lectureHallDao")
@Transactional
public class LectureHallDaoImp implements LectureHallDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addLectureHall(LectureHall lectureHall) {
        try {
            sessionFactory.getCurrentSession().persist(lectureHall);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public LectureHall get(int id) {
        return sessionFactory.getCurrentSession().get(LectureHall.class, Integer.valueOf(id));

    }

    @Override
    public List<LectureHall> lectureHallList() {
        String selectLectureHallList = "From LectureHall ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectLectureHallList);
        return query.getResultList();
    }
}
