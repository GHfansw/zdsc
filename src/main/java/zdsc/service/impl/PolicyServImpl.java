package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.PolicyDAO;
import zdsc.model.Policy;
import zdsc.service.PolicyServ;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
@Service
public class PolicyServImpl implements PolicyServ {

    @Autowired
    private PolicyDAO policyDao;

    public List<Policy> getPolicys() {
        return this.policyDao.findAll();
    }

    public List<Policy> getPolicysByClassfication(String clsf) {
        return this.policyDao.findByClassification(clsf);
    }
}
