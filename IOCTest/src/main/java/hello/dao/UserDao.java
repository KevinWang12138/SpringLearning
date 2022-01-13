package hello.dao;

import org.springframework.stereotype.Repository;
import hello.po.User;

@Repository
public class UserDao {
    private final String USERNAME = "admin";
    private final String USERPWD = "123456";//模拟查询到的结果
    public User queryUserByName(String username){
        //判断用户对象，用户名是否存在
        if(!username.equals(USERNAME)){
            return null;
        }else{
            User user=new User();
            user.setUserName(username);
            user.setUserId(1);
            user.setUserPwd(USERPWD);
            return user;
        }
    }
}
