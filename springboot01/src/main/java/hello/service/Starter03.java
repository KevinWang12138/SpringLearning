package hello.service;

import hello.config.IocConfig03;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter03 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocConfig03.class);
        IocConfig03 iocConfig03=(IocConfig03) applicationContext.getBean(IocConfig03.class);
        iocConfig03.test();
        AccountService accountService=(AccountService) applicationContext.getBean("accountService");
        accountService.test();
    }
}
