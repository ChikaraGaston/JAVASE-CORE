package day8.test;

import day8.ITestDemo;
import day8.ProxyDemo;
import day8.TestDemoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        ITestDemo test=new TestDemoImpl();
        /**
         * 如果一个对象想要通过Proxy.newProxyInstance方法被代理，
         * 那么这个类一定要有对应的接口
         */
        test.test1();
        test.test2();
        System.out.println();

        /**
         * 需求：执行方法时需要加入一些东西，
         * 在执行方法前打印test1或者test2开始执行
         * 在执行后，打印test1或者test2执行完毕
         *
         * ！！注意：打印的方法名，要和调用方法保持一致
         */

        //创建一个代理对象
        InvocationHandler handler=new ProxyDemo(test);

        /**
         * Proxy.newProxyInstance()
         * 参数1是代理对象的类加载器
         * 参数2是被代理对象的接口
         * 参数2是代理对象
         *
         * 返回值就是成功被代理后对象，返回的是obj类型，需要根据情况转换类型
         */


        ITestDemo t= (ITestDemo) Proxy.newProxyInstance
                (handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);

        t.test1();
        System.out.println();
        t.test2();

        /**
         * 1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法，以完成代理的具体操作。
         * 2.创建被代理的类以及接口
         *
         * 3.通过Proxy的静态方法
         * newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) 创建一个Subject接口代理
         * 4.通过 Subject代理调用RealSubject实现类的方法
         */

    }
}
