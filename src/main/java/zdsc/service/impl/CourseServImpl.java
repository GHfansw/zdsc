package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.CourseDAO;
import zdsc.model.Course;
import zdsc.service.CourseServ;

import java.util.List;

/**
 * Created by lenovo on 2017/6/15.
 */
@Service
public class CourseServImpl implements CourseServ{
    @Autowired
    private CourseDAO courseDAO;

    public List<Course> getCourseByLevel(int l) {
        return this.courseDAO.findByLevel(l);
    }
}
