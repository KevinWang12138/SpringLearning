package hello.config;

import hello.dao.AccountDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hello")
public class IocConfig02 {
    /**
     * 一般用于集成第三方组件
     * 因为第三方组件我们不能在内部设置它为bean，所以在配置类里将它交给IOC
     * @return
     */
    @Bean//方法的返回值会交给IOC进行维护
    public AccountDao getAccount(){
        return new AccountDao();
    }
}
