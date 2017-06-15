package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.Scpx;

/**
 * Created by lenovo on 2017/6/15.
 */
@Repository
public interface ScpxVO {
    public Scpx findPage();
}
