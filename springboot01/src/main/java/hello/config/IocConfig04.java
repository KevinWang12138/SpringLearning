package hello.config;

import hello.annotation.MyComScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@MyComScan("hello")
@PropertySource({"classpath:jdbc.properties","classpath:user.properties"})
public class IocConfig04 {
    @Value("${jdbc.username}")
    private String name;

    public void test(){
        System.out.println(name);
    }
}
