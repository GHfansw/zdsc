package zdsc.dao;

import org.springframework.stereotype.Repository;
import zdsc.model.User;

/**
 * Created by lenovo on 2017/6/11.
 */
@Repository //bean注释 可以加括号 里面设置bean的名字
public interface IUserDAO {
    public User selectByPrimaryKey(int id);
}
