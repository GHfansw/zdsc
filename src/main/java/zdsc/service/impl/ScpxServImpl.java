package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.ScpxVO;
import zdsc.model.Scpx;
import zdsc.service.ScpxServ;

/**
 * Created by lenovo on 2017/6/15.
 */
@Service
public class ScpxServImpl implements ScpxServ {

    @Autowired
    private ScpxVO scpxVO;

    public Scpx getPage() {
        return this.scpxVO.findPage();
    }
}
