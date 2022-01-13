package hello.service;

import hello.dao.UserDao;
import org.springframework.stereotype.Service;
import hello.po.User;
import hello.po.vo.MessageModel;

import javax.annotation.Resource;

@Service
public class UserService {
    //注入
    @Resource
    public UserDao userDao;

    public MessageModel userLogin(String userName,String userPwd){
        MessageModel messageModel=new MessageModel();
        //参数的非空校验
        if(userName == null || "".equals(userName)){
            messageModel.setCode(0);
            messageModel.setMsg("用户名不能为空");
            return messageModel;
        }
        if(userPwd == null || "".equals(userPwd)){
            messageModel.setCode(0);
            messageModel.setMsg("密码不能为空");
            return messageModel;
        }


        //调用Dao层的查询方法，判断用户对象是否存在
        User user=userDao.queryUserByName(userName);
        //判断用户对象是否为空
        if(user==null){
            messageModel.setCode(0);
            messageModel.setMsg("用户对象不存在");
            return messageModel;
        }
        //比较密码是否正确
        if(!user.getUserPwd().equals(userPwd)){
            messageModel.setCode(0);
            messageModel.setMsg("密码不正确");
            return messageModel;
        }

        messageModel.setCode(1);
        messageModel.setMsg("成功登录");
        return messageModel;

    }
}
