package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("brbrbr")
public class URLController {
    @RequestMapping({"url01","url"})
    public ModelAndView url01(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hello","url01");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping(value = "/url02",method = RequestMethod.POST)
    public ModelAndView url02(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hello","url02");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping(value = "/url03",params = "a")
    public ModelAndView url03(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hello","url03");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
