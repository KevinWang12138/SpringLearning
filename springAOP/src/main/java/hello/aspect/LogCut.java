package hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 定义切面
 *      设置注解
 *      由切入点与通知的结合
 *
 *      定义切入点  PointCut
 *          规定需要拦截哪些方法
 *          @PointCut("匹配规则")
 *
 *      定义通知
 *          前置通知 @Before
 *          返回通知 @AfterReturning
 *          异常通知 @AfterThrowing
 *          最终通知 @After
 *          环绕通知 @ARound
 */
@Component //交给IOC
@Aspect //当前是一个切面类
public class LogCut {
    /**
     * 定义切入点
     */
    @Pointcut("execution(* hello.service..*.*(..))")
    public void cut(){}


    /**
     * 定义通知
     */
    @Before(value = "cut()")
    public void before(){
        System.out.println("前置通知...");
    }
    @AfterReturning(value = "cut()")
    public void afterReturn(){
        System.out.println("返回通知...");
    }
    @After(value = "cut()")
    public void after(){
        System.out.println("最终通知...");
    }
    @AfterThrowing(value = "cut()", throwing = "e")
    public void throwReturn(Exception e){
        System.out.println("异常通知...");
        System.out.println(e.getMessage());
    }

    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("环绕通知-前置通知...");
        Object object=null;
        try {
            object = pjp.proceed();
            System.out.println("环绕通知-返回通知...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-异常通知...");
        }
        System.out.println("环绕通知-最终通知...");
        return object;
    }

}
