package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping({"hello","helloyou"})//通过requestmapping绑定访问的URL，匹配路径是hello.do的URL
    public ModelAndView hello(){
        //得到ModelAndView对象
        ModelAndView modelAndView=new ModelAndView();
        //设置模型数据
        modelAndView.addObject("hello","Hello SpringMVC!");
        //设置视图
        modelAndView.setViewName("hello");//会去查找一个视图名称是hello的页面
        //返回模型视图
        return modelAndView;
    }
}
