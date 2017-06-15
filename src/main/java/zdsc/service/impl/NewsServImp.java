package zdsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zdsc.dao.NewsDAO;
import zdsc.model.News;
import zdsc.service.NewsServ;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */

@Service
public class NewsServImp implements NewsServ {
    @Autowired
    private NewsDAO newsDao;

    public List<News> getNews() {
        return this.newsDao.findAll();
    }

    public List<News> getNewsByClassfication(String clsf) {
        return this.newsDao.findByClassification(clsf);
    }
}
