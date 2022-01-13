package hello.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理采用继承思想。生成一个子类，继承目标对象。
 * 目标类不能用final修饰
 */
public class CglibProxy {
    private Object target;
    public CglibProxy(Object target){
        this.target=target;
    }
    /**
     * 得到一个代理对象
     * @return
     */
    public Object getProxy(){
        //通过调用enhancer对象的create方法，可以生成一个类（代理对象）
        Enhancer enhancer=new Enhancer();
        //将目标对象设置为当前生成类的父类
        enhancer.setSuperclass(target.getClass());
        //设置拦截器
        MethodInterceptor methodInterceptor=new MethodInterceptor() {
            /**
             * 每当代理实例的方法被调用，intercept方法都会被执行一次
             * @param o
             * @param method
             * @param objects
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object obj=method.invoke(target,objects);
                System.out.println("intercept...");
                return obj;
            }
        };
        //设置拦截器
        enhancer.setCallback(methodInterceptor);
        //返回生成的代理类
        return enhancer.create();
    }
}
