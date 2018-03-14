package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.SemesterDao;
import com.akalanka.coursemanagement.backend.dto.Semester;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("semesterDao")
@Transactional
public class SemesterDaoImp implements SemesterDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addSemester(Semester semester) {
        try {
            sessionFactory.getCurrentSession().persist(semester);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Semester get(int id) {
        return sessionFactory.getCurrentSession().get(Semester.class, Integer.valueOf(id));

    }

    @Override
    public List<Semester> getlist(int id) {
        String selectLectureHallList = "From Semester WHERE id= :id ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectLectureHallList);
        query.setParameter("id",id);
        return query.getResultList();
    }

    @Override
    public List<Semester> allSemesterList() {
        String selectSemesterList = "From Semester ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectSemesterList);
        return query.getResultList();
    }
}
