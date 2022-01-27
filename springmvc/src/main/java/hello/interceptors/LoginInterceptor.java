package hello.interceptors;

import hello.vo.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 非法请求拦截
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    /**
     * 判断用户是否登录，判断session中是否存在user对象
     *      如果登录，访问目标方法，否则拦截
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断用户是否登录
        User user=(User)request.getSession().getAttribute("user");
        //如果为空，则阻止访问目标方法，并重定向到登陆页面
        if(user==null){
            //重定向到登录页面
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
        }
        //如果是登录状态，则访问目标方法
        return true;
    }
}
