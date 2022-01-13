package hello.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class JdkProxy {
    public JdkProxy(Object target){
        this.target=target;
    }
    //目标角色
    private Object target;
    /**
     * 得到一个代理对象
     * @return
     */
    public Object getProxy(){
        //得到类加载器
        ClassLoader classLoader=this.getClass().getClassLoader();

        //得到目标对象实现的接口数组
        Class[] interfaces=target.getClass().getInterfaces();

        //得到InvocationHandler接口
        InvocationHandler invocationHandler=new InvocationHandler() {
            /**
             * 当代理实例中的方法被调用时，invoke方法就会执行一次
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke...");
                //调用目标对象中的方法，invoke
                Object obj=method.invoke(target,args);

                //目标方法的返回值
                return obj;
            }
        };
        //得到代理实例
        Object proxy = Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
        return proxy;
    }
}
