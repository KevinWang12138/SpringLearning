package hello.controller;

import hello.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public String login(Model model, HttpSession session) {
        model.addAttribute("action","用户登录");
        User user=new User();
        user.setUserId(1);
        user.setUserName("wang");
        session.setAttribute("user",user);
        return "a";
    }
    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("action","用户添加");
        return "a";
    }
}
