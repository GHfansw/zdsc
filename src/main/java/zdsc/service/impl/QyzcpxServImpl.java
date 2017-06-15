package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.QyzcpxVO;
import zdsc.model.Qyzcpx;
import zdsc.service.QyzcpxServ;

/**
 * Created by lenovo on 2017/6/15.
 */
@Service
public class QyzcpxServImpl implements QyzcpxServ {

    @Autowired
    private QyzcpxVO qyzcpxVO;

    public Qyzcpx getPage() {
        return this.qyzcpxVO.findPage();
    }
}
