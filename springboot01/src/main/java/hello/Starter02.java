package hello;

import hello.config.IocConfig02;
import hello.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocConfig02.class);
        IocConfig02 iocConfig02=applicationContext.getBean(IocConfig02.class);
        AccountDao accountDao=iocConfig02.getAccount();
        AccountDao accountDao1=iocConfig02.getAccount();
        System.out.println(accountDao);
        System.out.println(accountDao1);
        accountDao.test();
    }
}
