package hello;

import hello.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=(UserService) beanFactory.getBean("userService");
        userService.test();
    }
}
