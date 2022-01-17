package hello.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//标志当前类是一个配置类
@ComponentScan("hello")//设置扫描包的范围
public class IocConfig {
}
