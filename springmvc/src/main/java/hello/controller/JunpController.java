package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 重定向：
 *      以redirect开头，地址栏会改变
 *      redirect:xx.jsp跳转到页面
 *      redirect:xxx跳转到方法
 * 请求转发：
 *      服务器内部默认使用请求转发
 *      请求转发以froward开头，地址栏不发生改变
 */
@Controller
public class JunpController {
    /**
     * 重定向
     * 返回modelandview
     */
    @RequestMapping("test01")
    public ModelAndView test01(){
        ModelAndView modelAndView=new ModelAndView();
        System.out.println("test01...");
        modelAndView.setViewName("redirect:hello.do");
        return modelAndView;
    }

    /**
     * 重定向跳转到页面
     */
    @RequestMapping("test02")
    public ModelAndView test02(){
        ModelAndView modelAndView=new ModelAndView();
        System.out.println("test02...");
        /**
         * 会从项目的根路径下寻找文件
         */
        modelAndView.setViewName("redirect:view.jsp");
        return modelAndView;
    }
    /**
     * 重定向到jsp页面
     */
    @RequestMapping("test03")
    public String test03(){
        System.out.println("test03...");
        return "redirect:view.jsp";
    }
    /**
     * 重定向到jsp页面，并传递参数
     */
    @RequestMapping("test04")
    public String test04(){
        System.out.println("test04...");
        return "redirect:view.jsp?uname=admin";
    }

    /**
     * 重定向到jsp页面，并传递中文参数，如下所示是错误的，传递中文参数这样会接收不到
     */
    @RequestMapping("test05")
    public String test05(){
        System.out.println("test05...");
        return "redirect:view.jsp?uname=张三";
    }

    /**
     * 重定向到jsp页面，并传递中文参数的正确写法
     */
    @RequestMapping("test06")
    public String test06(RedirectAttributes redirectAttributes){
        System.out.println("test06...");
        redirectAttributes.addAttribute("uname","张三");
        return "redirect:view.jsp";
    }

    /**
     * 重定向到Controller
     */
    @RequestMapping("test07")
    public String test07(){
        System.out.println("test07...");
        return "redirect:hello.do";
    }

    /**
     * 请求转发到jsp页面
     * @return
     */
    @RequestMapping("test08")
    public String test08(){
        System.out.println("test08...");
        return "forward:view.jsp";
    }

    /**
     * 请求转发到jsp页面，并传递参数
     * @return
     */
    @RequestMapping("test09")
    public String test09(){
        System.out.println("test09...");
        return "forward:view.jsp?uname=admin";
    }

    /**
     * 请求转发到jsp页面
     *      设置请求域
     * @return
     */
    @RequestMapping("test10")
    public String test10(HttpServletRequest request){
        System.out.println("test10...");
        request.setAttribute("userName","张三");
        return "forward:view.jsp";
    }

    /**
     * 请求转发到jsp页面，默认去指定页面寻找jsp页面，想到上一级，需要/../xxx
     * @return
     */
    @RequestMapping("test11")
    public String test11(){
        System.out.println("test11...");
        return "/../../view";
    }
    /**
     * 请求转发到Controller
     * @return
     */
    @RequestMapping("test12")
    public String test12(){
        System.out.println("test12...");
        return "forward:hello.do";
    }
    /**
     * 请求转发到Controller的另外一种方法
     * @return
     */
    @RequestMapping("test13")
    public ModelAndView test13(){
        System.out.println("test13...");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("forward:hello.do");
        return modelAndView;
    }

}
