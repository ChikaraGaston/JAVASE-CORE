package day4;

public class Person {
    String name;
    public Person(){
        this.name="张三";
        System.out.println("此处执行的是无参构造方法");
    }

    //创建一个非静态的代码块
    {
        System.out.println("此处执行的是非静态的代码块");
    }

    //静态代码块
    //其主要是用来初始化static 变量
    {
        System.out.println("此处执行的是静态的代码块");
    }
}
