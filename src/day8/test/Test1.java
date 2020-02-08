package day8.test;

import day8.Student;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {


        try {
            Class clazz=Class.forName("day8.Student");//通过包名.类名的字符串调用Class.forName方法获取指定类的Class实例
//
//            Class superClass=clazz.getSuperclass();//获取父类
//            System.out.println(superClass.getName());
//
//            Class[] interfaces=clazz.getInterfaces();//获取当前类的所有接口
//
//            //遍历
//            for (Class c:interfaces){
//                System.out.println("接口："+c.getName());
//            }

//            Constructor[] cons=clazz.getConstructors();//获取公有构造方法
//            for (Constructor c:cons){
//                System.out.println(c.getName());//取得方法修饰符
//
//                //getModifiers()取得方法的修饰符，返回1为public
//                System.out.println(c.getModifiers());//取得方法的修饰符
//
//
//            }


//            Constructor[] cons1=clazz.getDeclaredConstructors();//获取类的所有构造方法
//            for (Constructor c:cons1){
//                System.out.println(c.getName());//取得方法修饰符
//
//                //getModifiers()取得方法的修饰符，返回2为private
//                System.out.println(c.getModifiers());//取得方法的修饰符
//
//
//                Class[] paramClazz=c.getParameterTypes();
//                for (Class pc:paramClazz){
//                    System.out.println(pc.getName());
//                }
//            }


            /**
             * 如何用反射的构造方法来构建对象
             */
//            try {
//                //此种写法等同于调用了Student类的无参构造方法
////                Object obj=clazz.newInstance();
////                Student stu= (Student) obj;
////                //System.out.println(stu.school);
////
////                //指定获取有一个参数并且为String类型的公有的构造方法
////                Constructor c=clazz.getConstructor(String.class);
////                Student stu1= (Student) c.newInstance("第一中学");//构造方法实例化，调用了public Student(String school)方法
////                System.out.println(stu1.school);

//                //通过反射机制可以强制调用私有的构造方法
//                //首先获取私有构造方法
//                Constructor c=clazz.getDeclaredConstructor(String.class,int.class);//指定获取有两个参数的私有构造方法
//                //解除私有封装
//                c.setAccessible(true);
//                //强制调用
//                Student stu= (Student) c.newInstance("zhangsan",12);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//            Method[] ms = clazz.getMethods();
//            Method[] ms = clazz.getDeclaredMethods();//获取类的所有方法
//            for (Method m:ms){
//                System.out.println("方法名"+m.getName());
//                System.out.println("返回值类型"+m.getReturnType());
//                System.out.println("修饰符"+m.getModifiers());
//
//                Class[] pcs=m.getParameterTypes();//获取方法的参数类型，是一个数组，方法有几个参数，数据就有几个
//                if (pcs !=null && pcs.length>0){
//                    for (Class pc:pcs){
//                        System.out.println("参数类型"+pc.getName());
//                    }
//                }
//
//
//                System.out.println();
//            }

//            Field[] fs=clazz.getDeclaredFields();//不包含父类属性
//            for (Field f:fs){
//                System.out.println("修饰符："+f.getModifiers());
//                System.out.println("属性名称："+f.getType());
//                System.out.println("属性名称："+f.getName());
//                System.out.println();
//            }
//
//            Package p=clazz.getPackage();//获取类所在的包
//            System.out.println(p.getName());


            /**
             * 无论是反射调用setInfo还是test方法，都是调用obj对象的方法，obj对象实际上就是Student对象
             */

//            Method m=clazz.getMethod("setInfo", String.class, String.class);//得到名称是setInfo，参数是String，String的方法
//            //获取无参构造，使用使用newInstance创建对象
//            Object obj=clazz.getConstructor().newInstance();
//            m.invoke(obj,"zhangsan","第一中学");//参数一是需要实例化的对象，后面的参数是调用当前方法的实际参数
//
//            //如果想要调用私有方法
//            Method m1=clazz.getDeclaredMethod("test", String.class);//获取方法名为test，参数为String类型的方法
//            m1.setAccessible(true);
//            m1.invoke(obj,"李四");
//
//            //调用一个重载方法
//            Method m2=clazz.getMethod("setInfo", int.class);
//            m2.invoke(obj,1);
//
//            //又返回值得方法
//            Method m3=clazz.getMethod("getSchool");//这是获取方法名为getSchool并且没有参数的方法
//            String school= (String) m3.invoke(obj);//调用有返回值，但没有参数的方法
//            System.out.println(school);


            //反射创建一个对象
            Constructor con=clazz.getConstructor();
            Student stu = (Student) con.newInstance();

            Field f=clazz.getField("school");//获取名称为school的属性
            f.set(stu,"第三中学");//对stu对象的school属性设置值
            String str= (String) f.get(stu);//获取stu对象的school属性的值
            System.out.println(str);

            Field f1=clazz.getDeclaredField("privateFiiled");
            f1.setAccessible(true);
            f1.set(stu,"测试私有属性");
            System.out.println(f1.get(stu));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
