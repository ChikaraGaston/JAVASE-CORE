package day8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */

public class ProxyDemo implements InvocationHandler {

    Object obj;

    public ProxyDemo(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(method.getName()+"方法开始执行");
        Object result = method.invoke(this.obj,args);
        System.out.println(method.getName()+"方法执行完毕");
        return null;
    }


}
