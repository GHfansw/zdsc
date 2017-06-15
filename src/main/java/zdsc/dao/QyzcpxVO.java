package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.Qyzcpx;

/**
 * Created by lenovo on 2017/6/15.
 */
@Repository
public interface QyzcpxVO {
    public Qyzcpx findPage();
}
