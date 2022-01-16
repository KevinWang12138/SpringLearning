package hello;

import hello.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService=(AccountService) applicationContext.getBean("accountService");
        accountService.tranfer(1,2,100.0);
    }

}
