package hello;

import hello.config.IocConfig04;
import hello.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.soap.SOAPBinding;

public class Starter03 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocConfig04.class);
        IocConfig04 iocConfig04=applicationContext.getBean(IocConfig04.class);
        iocConfig04.test();
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.test();
    }

}
