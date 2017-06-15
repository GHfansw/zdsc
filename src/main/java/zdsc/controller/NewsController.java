package zdsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import zdsc.model.News;
import zdsc.service.NewsServ;

import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsServ newsServ;

    @RequestMapping("/")
    public String toIndex(HttpServletRequest request, Model model) {
        List<News> news = this.newsServ.getNews();
        model.addAttribute("news", news);
        return "shownews";
    }
}
