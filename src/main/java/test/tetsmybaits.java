package test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import zdsc.model.*;
import zdsc.service.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class tetsmybaits {
    private static Logger logger = Logger.getLogger(tetsmybaits.class);
    //  private ApplicationContext ac = null;
    @Resource
    private IUserServ userService = null;
    @Resource
    private NewsServ newsServ = null;
    @Resource
    private PolicyServ policyServ = null;
    @Resource
    private ScpxServ scpxServ = null;
    @Resource
    private CourseServ courseServ = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));

    }

    @Test
    public void test2() {
        List<News> news = newsServ.getNews();
        logger.info(JSON.toJSONString(news));
    }

    @Test
    public void test3() {
        List<Policy> policy = policyServ.getPolicys();
        logger.info(JSON.toJSONString(policy));
    }

    @Test
    public void test4() {
        List<Policy> policy = policyServ.getPolicysByClassfication("type2");
        logger.info(JSON.toJSONString(policy));
    }
    @Test
    public void test5() {
        Scpx scpx = scpxServ.getPage();
        logger.info(JSON.toJSONString(scpx));
    }

    @Test
    public void test6() {
        List<Course> courses = courseServ.getCourseByLevel(1);
        logger.info(JSON.toJSONString(courses));
    }

}