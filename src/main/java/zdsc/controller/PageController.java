package zdsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zdsc.model.*;
import zdsc.service.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2017/6/15.
 */
@Controller
@RequestMapping("/")
public class PageController {
    @Autowired
    private ScpxServ scpxServ;
    @Autowired
    private QyzcpxServ qyzcpxServ;
    @Autowired
    private NewsServ newsServ;
    @Autowired
    private PolicyServ policyServ;
    @Autowired
    private CourseServ courseServ;


    @RequestMapping("/scpx")
    public String toScpx(HttpServletRequest request, Model model) {
        Scpx scpx = this.scpxServ.getPage();
        model.addAttribute("scpx", scpx);
        List<News> news = this.newsServ.getNewsByClassfication("type1");
        model.addAttribute("news", news);
        List<Policy> policy = this.policyServ.getPolicysByClassfication("type1");
        model.addAttribute("policy", policy);
        return "scpx";
    }

    @RequestMapping("/qyzcpx")
    public String toQuzcpx(HttpServletRequest request, Model model) {
        Qyzcpx qyzcpx = this.qyzcpxServ.getPage();
        model.addAttribute("qyzcpx", qyzcpx);
        List<News> news = this.newsServ.getNewsByClassfication("type2");
        model.addAttribute("news", news);
        List<Policy> policy = this.policyServ.getPolicysByClassfication("type2");
        model.addAttribute("policy", policy);
        return "qyzcpx";
    }

    @RequestMapping("/zysyjspx")
    public String toZysyjspx(HttpServletRequest request, Model model) {
        List<Course> courses1 = this.courseServ.getCourseByLevel(1);
        model.addAttribute("courses1", courses1);
        List<Course> courses2 = this.courseServ.getCourseByLevel(2);
        model.addAttribute("courses2", courses2);
        List<Course> courses3 = this.courseServ.getCourseByLevel(3);
        model.addAttribute("courses3", courses3);
        return "zysyjspx";
    }

    @RequestMapping("/zcfg")
    public String toZcfg(HttpServletRequest request, Model model) {
        List<Policy> policy = this.policyServ.getPolicys();
        model.addAttribute("policy", policy);
        return "zcfg";
    }
}
