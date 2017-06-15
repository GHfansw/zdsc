package zdsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zdsc.model.Policy;
import zdsc.service.PolicyServ;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2017/6/14.
 */
@Controller
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    private PolicyServ policyServ;

    @RequestMapping("/")
    public String toIndex(HttpServletRequest request, Model model) {
        List<Policy> policy = this.policyServ.getPolicys();
        model.addAttribute("policy", policy);
        return "shownews";
    }
}
