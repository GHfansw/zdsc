package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.News;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
@Repository
public interface NewsDAO {
    public List<News> findAll();
    public List<News> findByClassification(String clsf);
}
