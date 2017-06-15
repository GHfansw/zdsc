package zdsc.service;

import zdsc.model.News;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
public interface NewsServ {
    public List<News> getNews();
    public List<News> getNewsByClassfication(String clsf);
}
