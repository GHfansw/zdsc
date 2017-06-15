package zdsc.service;

import zdsc.model.Course;

import java.util.List;

/**
 * Created by lenovo on 2017/6/15.
 */
public interface CourseServ {
    public List<Course> getCourseByLevel(int l);
}
