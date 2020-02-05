package day6.test;

import day6.A;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List list =new ArrayList();
//        list.add("sdasd");
//        list.add(11);
//        list.add(false);
        /**
         * 假设我现在的需求是只能在集合中存字符串，这时候就需要用到泛型
         * 泛型只在编译中生效，不会进入运行阶段
         */

        List<String> list =new ArrayList<String>();
        //上述就是类型安全的

        A<String> a1=new A<String>();//new对象的时候已经指定了数据类型
        a1.setKey("sdsa");
        String s=a1.getKey();

        A a2=new A();
        a2.setKey(new Object());

    }
}
