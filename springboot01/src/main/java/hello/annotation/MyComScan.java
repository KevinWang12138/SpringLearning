package hello.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 自定义组合注解
 *      拥有元注解+@Configuratin+@ComponentScan
 *      覆盖value属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Configuration
@ComponentScan
public @interface MyComScan {
    //通过value属性设置扫描包的范围
    String[] value() default {};
}
