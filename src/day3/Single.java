package day3;

/**
 * 实现一个饿汉式的单例
 */
public class Single {

 /*   public Single(){
        //我们假设在执行该构造方法中要执行1000行代码，耗时很长，占用大量资源，实例化一个对象假设会浪费10秒
        //这种情况就非常适合使用单例模式，只new一次对象，以后就一直使用这个对象来进行访问操作。
    }*/

    //做一个私有的构造方法，此时该类不同直接通过new来实例化对象
    private Single(){

    }
    //做一个静态的，私有的类变量，再将其实例化
    private static Single s=new Single();

    //再写一个公有的static方法对其进行调用访问
    public static Single getInstance(){
        return s;
    }
}
