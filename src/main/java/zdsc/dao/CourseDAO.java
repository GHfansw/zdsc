package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.Course;

import java.util.List;

/**
 * Created by lenovo on 2017/6/15.
 */
@Repository
public interface CourseDAO {
    public List<Course> findByLevel(int l);
}
