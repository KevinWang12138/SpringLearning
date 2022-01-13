package hello.jdkProxy;

import hello.staticProxy.Marry;
import hello.staticProxy.RentHouse;
import hello.staticProxy.User;

public class JdkProxyTest {
    public static void main(String[] args) {
        RentHouse target1=new User();
        //获取代理类
        JdkProxy jdkProxy1 = new JdkProxy(target1);
        //调用代理类中的方法，得到代理对象
        RentHouse rentHouse=(RentHouse) jdkProxy1.getProxy();

        rentHouse.toRentHouse();

        Marry target2 = new User();

        JdkProxy jdkProxy2 = new JdkProxy(target2);

        Marry marry=(Marry) jdkProxy2.getProxy();

        marry.toMarry();
    }
}
