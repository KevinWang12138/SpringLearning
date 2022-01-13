package hello.controller;

import org.springframework.stereotype.Controller;
import hello.po.vo.MessageModel;
import hello.service.UserService;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    public UserService userService;

    public MessageModel userLogin(String userName,String userPwd){
        //调用Service层的方法
        MessageModel messageModel=userService.userLogin(userName,userPwd);
        return messageModel;
    }
}
