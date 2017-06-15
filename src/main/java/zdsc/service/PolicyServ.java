package zdsc.service;

import zdsc.model.Policy;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
public interface PolicyServ {
    public List<Policy> getPolicys();
    public List<Policy> getPolicysByClassfication(String clsf);
}
