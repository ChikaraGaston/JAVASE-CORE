package day3.test;

import day3.Single;

public class TestSingle {
    public static void main(String[] args) {
        //单例模式下传统的方式不能实例化对象
        //Single s=new Single()；
        //并且类变量也是私有的无法通过其调用
        //Single.（找不到类变量）

        //饿汉式正确的写法
        Single s =Single.getInstance();
    }
}
