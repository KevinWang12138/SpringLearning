package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 设置请求域
 *      1.ModelAndView对象
 *      2.HttpServletRequest对象
 *      3.Model对象
 *      4.ModelMap对象
 *      5.Map对象
 */
@Controller
@RequestMapping("data")
public class DataController {
    @RequestMapping("data01")
    public ModelAndView data01(){
        System.out.println("目标方法...");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("uname","admin");
        modelAndView.setViewName("data");
        return modelAndView;
    }

    @RequestMapping("data02")
    public ModelAndView data02(ModelAndView modelAndView){
        modelAndView.addObject("uname","admin02");
        modelAndView.setViewName("data");
        return modelAndView;
    }

    @RequestMapping("data03")
    public String data03(HttpServletRequest request){
        request.setAttribute("uname","data03");
        return "data";
    }

    @RequestMapping("data04")
    public String data04(Model model){
        model.addAttribute("uname","04");
        return "data";
    }

    @RequestMapping("data05")
    public String data05(ModelMap map){
        map.addAttribute("uname","05");
        return "data";
    }

    @RequestMapping("data06")
    public String data06(Map map){
        map.put("uname","06");
        return "data";
    }
}
