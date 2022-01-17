package hello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("hello")
@PropertySource(value = {"classpath:jdbc.properties","classpath:user.properties"})
public class IocConfig03 {
    @Value("${jdbc.username}")
    private String jdbcname;
    @Value("${jdbc.password}")
    private String jdbcpwd;
    @Value("${user.userName}")
    private String name;
    @Value("${user.password}")
    private String pwd;

    public void test(){
        System.out.println(jdbcname+" "+jdbcpwd);
        System.out.println(name+" "+pwd);
    }

}
