package hello.cglibProxy;

import hello.staticProxy.RentHouse;
import hello.staticProxy.User;
import hello.staticProxy.User2;

public class CglibProxyTest {
    public static void main(String[] args) {
        //目标对象
        RentHouse target=new User();
        //得到代理类
        CglibProxy cglibProxy=new CglibProxy(target);
        //得到代理对象
        RentHouse proxy=(RentHouse) cglibProxy.getProxy();
        //通过代理对象调用目标对象的方法
        proxy.toRentHouse();

        User2  user2=new User2();

        CglibProxy cglibProxy1=new CglibProxy(user2);

        User2 proxy1=(User2)cglibProxy1.getProxy();

        System.out.println(proxy1.hello("hello"));
    }
}
