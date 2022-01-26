package hello.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现HandlerInterceptor接口
 */
public class MyInterceptor01 implements HandlerInterceptor {
    /**
     * 在目标方法执行前执行
     *      返回值是布尔类型
     *      返回true返回目标方法
     *      返回false阻止目标方法执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor01:在目标方法执行前执行");
        return true;
    }

    /**
     * 在目标方法执行后，视图生成前执行
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor01:在目标方法执行后，视图生成前执行");
    }

    /**
     * 在目标方法执行后，视图生成后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor01:在目标方法执行后，视图生成后执行");
    }

}
