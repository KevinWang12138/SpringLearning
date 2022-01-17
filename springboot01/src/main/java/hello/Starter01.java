package hello;

import hello.config.IocConfig;
import hello.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocConfig.class);
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
