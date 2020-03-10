package com.atguigu.java;

/**
 * 人
 */
public class Person {
    //属性 类成员变量可以先声明，不需要初始化，其拥有默认值,如string的默认值为null
    String name;
    int age;

    //方法
    public void showName(){//方法名称如果是多个单词，首个单词小写，其他单词首字母大写，驼峰命名法
        System.out.println("姓名："+name);
    }

    public int getAge(){
            return age;
    }

}
