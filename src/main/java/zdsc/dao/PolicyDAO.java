package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.Policy;
import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
@Repository
public interface PolicyDAO{
    public List<Policy> findAll();
    public List<Policy> findByClassification(String clsf);
}
