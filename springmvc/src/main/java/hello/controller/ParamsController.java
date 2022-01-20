package hello.controller;

import hello.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 参数绑定
 */
@Controller
public class ParamsController {
    /**
     * 基本数据类型
     *      参数值必须存在，如果没有写明参数值，也没有指定参数的默认值，就会报错500（服务器内部错误）
     * @param age
     * @param money
     */
    @RequestMapping("/data01")
    public void data01(int age,double money){
        System.out.println(age);
        System.out.println(money);
    }

    /**
     * 设置基础数据类型的默认值
     * @param age
     * @param money
     */
    @RequestMapping("/data02")
    public void data02(@RequestParam(defaultValue = "18") int age, @RequestParam(defaultValue = "100.0")double money){
        System.out.println(age);
        System.out.println(money);
    }

    /**
     * 设置参数的别名
     * @param age
     * @param money
     */
    @RequestMapping("/data03")
    public void data03(@RequestParam(defaultValue = "18", name = "uage") int age, @RequestParam(defaultValue = "100.0", name = "umoney")double money){
        System.out.println(age);
        System.out.println(money);
    }

    /**
     * 将参数设置为包装类型，防止报错，因为包装类型可以是null
     * @param age
     * @param money
     */
    @RequestMapping("/data04")
    public void data04(Integer age, Double money){
        System.out.println(age);
        System.out.println(money);
    }

    /**
     * 字符串绑定
     * @param userName
     * @param userPwd
     */
    @RequestMapping("/data05")
    public void data05(String userName,String userPwd){
        System.out.println(userName);
        System.out.println(userPwd);
    }

    /**
     * 数组类型绑定
     * http://localhost:8080/springmvc01/data06.do?ids=1&ids=10
     * http://localhost:8080/springmvc01/data06.do?ids=1,10
     */
    @RequestMapping("/data06")
    public void data06(String[] ids){
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }
    }

    /**
     * JavaBean参数调用
     * 客户端传来的参数名要和bean内的属性名一致，javabean会自动进行封装
     * @param user
     */
    @RequestMapping("/data07")
    public void data07(User user){
        System.out.println(user.toString());
    }

    /**
     * 集合绑定，一般情况下集合绑定会通过javabean对象进行封装，传参时通过javabean中的属性字段名，设置集合的指定下标即可
     * @param user
     */
    @RequestMapping("/data08")
    public void data08(User user){
        System.out.println(user.toString());
    }

    /**
     * Map类型绑定
     * 会通过javabean封装，传参时要指定key的值
     * @param user
     */
    @RequestMapping("/data09")
    public void data09(User user){
        System.out.println(user.getMap().get("one"));
        System.out.println(user.getMap().get("two"));
    }

}
