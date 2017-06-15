package zdsc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zdsc.model.User;
import zdsc.service.IUserServ;

/**
 * Created by lenovo on 2017/6/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserServ userService;

    @RequestMapping("/showuser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showuser";
    }
}
