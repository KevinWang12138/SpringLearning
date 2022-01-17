package hello.service;

import hello.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public void test(){
        System.out.println("UserService...");
        userDao.test();
    }
}
