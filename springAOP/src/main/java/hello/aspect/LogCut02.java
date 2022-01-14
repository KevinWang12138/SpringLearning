package hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component //交给IOC
public class LogCut02 {
    /**
     * 定义切入点
     */
    public void cut(){}
    /**
     * 定义通知
     */

    public void before(){
        System.out.println("02前置通知...");
    }

    public void afterReturn(){
        System.out.println("02返回通知...");
    }

    public void after(){
        System.out.println("02最终通知...");
    }

    public void throwReturn(Exception e){
        System.out.println("02异常通知...");
        System.out.println(e.getMessage());
    }

    public Object around(ProceedingJoinPoint pjp){
        System.out.println("02环绕通知-前置通知...");
        Object object=null;
        try {
            object = pjp.proceed();
            System.out.println("02环绕通知-返回通知...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("02环绕通知-异常通知...");
        }
        System.out.println("02环绕通知-最终通知...");
        return object;
    }

}

