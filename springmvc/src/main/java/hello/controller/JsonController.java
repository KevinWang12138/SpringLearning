package hello.controller;

import hello.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

/**
 * Json配置
 * @ResponseBody
 *      默认返回的是一个页面，加上注解后返回的是一个Json格式的数据
 *      注解的声明：
 *          1.方法体上
 *          2.方法的返回值前，修饰符后
 * @RequestBody
 *      可以将请求体中的Json数据绑定到相应的Bean上，也可以分别绑定到对应的字符串上
 */
@Controller
public class JsonController {
    /**
     * ResponseBody注解。表示返回的是json格式的数据
     * @return
     */
    @ResponseBody
    @RequestMapping("query01")
    public User query01(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("admin");
        user.setUserPwd("123456");
        return user;
    }
    /**
     * ResponseBody注解。表示返回的是json格式的数据
     * 另一种放置注解的方式
     * @return
     */
    @RequestMapping("query02")
    public @ResponseBody User query02(){
        User user=new User();
        user.setUserId(1);
        user.setUserName("admin");
        user.setUserPwd("123456");
        return user;
    }

    @ResponseBody
    @RequestMapping("query03")
    public List<User> query03(){
        User user1=new User();
        user1.setUserId(1);
        user1.setUserName("admin1");
        user1.setUserPwd("123456");
        User user2=new User();
        user2.setUserId(2);
        user2.setUserName("admin2");
        user2.setUserPwd("123456");
        User user3=new User();
        user3.setUserId(3);
        user3.setUserName("admin3");
        user3.setUserPwd("123456");
        LinkedList<User> ret=new LinkedList<>();
        ret.add(user1);
        ret.add(user2);
        ret.add(user3);
        return ret;
    }

    /**
     * 要求前台传递Json数据，必须是json字符串
     * @param user
     * @return
     */
    @RequestMapping("query04")
    @ResponseBody
    public User query04(@RequestBody User user){
        System.out.println(user);
        return user;
    }

}
