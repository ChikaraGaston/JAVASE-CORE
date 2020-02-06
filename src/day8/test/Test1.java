package day8.test;

import java.lang.reflect.Constructor;

public class Test1 {
    public static void main(String[] args) {


        try {
            Class clazz=Class.forName("day8.Student");//通过包名.类名的字符串调用Class.forName方法获取指定类的Class实例

            Class superClass=clazz.getSuperclass();//获取父类
            System.out.println(superClass.getName());

            Class[] interfaces=clazz.getInterfaces();//获取当前类的所有接口

            //遍历
            for (Class c:interfaces){
                System.out.println("接口："+c.getName());
            }

            Constructor[] cons=clazz.getConstructors();//获取公有构造方法
            for (Constructor c:cons){
                System.out.println(c.getName());//取得方法修饰符

                //getModifiers()取得方法的修饰符，返回1为public
                System.out.println(c.getModifiers());//取得方法的修饰符
            }

//            Constructor[] cons1=clazz.getDeclaredConstructors();//获取类的所有构造方法
//            for (Constructor c:cons1){
//                System.out.println(c.getName());//取得方法修饰符
//
//                //getModifiers()取得方法的修饰符，返回2为private
//                System.out.println(c.getModifiers());//取得方法的修饰符
//            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
