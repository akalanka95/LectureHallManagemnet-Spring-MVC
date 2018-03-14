package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.CourseDao;
import com.akalanka.coursemanagement.backend.dto.Course;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;


@Repository("courseDao")
@Transactional
public class CourseDaoImp implements CourseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addCourse(Course course) {
        try {
            sessionFactory.getCurrentSession().persist(course);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Course get(int id) {
        return sessionFactory.getCurrentSession().get(Course.class, Integer.valueOf(id));

    }

    @Override
    public List<Course> getSemDepCourseList(int depid, int semid) {
        String selectProductsList = "From Course WHERE department_id= :depid AND semester_id= :semid";
        Query query = sessionFactory.getCurrentSession().createQuery(selectProductsList);
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        return query.getResultList();
    }

    @Override
    public List<Course> courseList() {
        String selectDepartmentRefList = "From Course";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepartmentRefList);
        return query.getResultList();
    }
}
