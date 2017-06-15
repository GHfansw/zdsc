package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.IUserDAO;
import zdsc.model.User;
import zdsc.service.IUserServ;

/**
 * Created by lenovo on 2017/6/11.
 */

@Service
public class IUserServImp implements IUserServ{
    @Autowired
    private IUserDAO userDao;

    public User getUserById(int id) {
        return this.userDao.selectByPrimaryKey(id);
    }
}

//@autowired和@resource注解 前者是spring注解 按byType自动注入 后者是J2EE注解默认按byName自动注入
