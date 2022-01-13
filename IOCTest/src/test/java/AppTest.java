import hello.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hello.po.vo.MessageModel;

public class AppTest {
    @Test
    public void testUserLogin(){
        //得到Spring的上下文环境
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring.xml");
        UserController userController=(UserController) beanFactory.getBean("userController");
        MessageModel messageModel=userController.userLogin("admin","123456");
        System.out.println(messageModel.getMsg());
    }
}
