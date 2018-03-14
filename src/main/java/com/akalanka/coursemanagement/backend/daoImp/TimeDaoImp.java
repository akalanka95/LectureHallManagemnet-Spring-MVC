package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.TimeDao;
import com.akalanka.coursemanagement.backend.dto.Time;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("timeDao")
@Transactional
public class TimeDaoImp implements TimeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addTime(Time time) {
        try {
            sessionFactory.getCurrentSession().persist(time);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Time get(int id) {
        return sessionFactory.getCurrentSession().get(Time.class, Integer.valueOf(id));

    }

    @Override
    public List<Time> getTimetList() {
        String selectTimeList = "From Time ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectTimeList);
        return query.getResultList();
    }
}
