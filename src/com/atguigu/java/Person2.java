package com.atguigu.java;

/**
 * 可变个数的形参
 */
public class Person2 {
    /**
     * 用数组传递可变个数的参数
     * 没有参数需要定义一个空数组或null
     * @param args
     */
    public void printInfo(String[] args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

    /**
     * java特有...方式传递可变个数的参数
     * 没有参数可以不填
     * ...代表可以传递0-多个参数
     * @param args
     */

    public void printInfo1(String... args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        Person2 p2 =new Person2();
        String[] ss=new String[]{"张三","11"};
        p2.printInfo(ss);
        String[] ss1=new String[]{"烟台市xxx","12345667","370481"};
        p2.printInfo(ss1);


        p2.printInfo1("李四","23","男");
        String[] ss2=new String[]{"烟台市xxx","12345667","370481"};
        p2.printInfo1(ss2);
    }
}
