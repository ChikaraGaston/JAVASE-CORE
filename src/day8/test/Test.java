package day8.test;
import day8.Person;

/**
 * 反射可以得到的信息：某个类的属性、方法和构造器、某个类到底实现了哪些接口。对于每个类而言，JRE 都为其保留一个不变的 Class 类型的对象。一个 Class 对象包含了特定某个类的有关信息。
 *   Class本身也是一个类
 *   Class 对象只能由系统建立对象
 *   一个类在 JVM 中只会有一个Class实例
 *   一个Class对象对应的是一个加载到JVM中的一个.class文件
 *   每个类的实例都会记得自己是由哪个 Class 实例所生成
 *   通过Class可以完整地得到一个类中的完整结构
 */

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        //clazz对象中就包含对象p所属的Person类的所有信息
        Class clazz=p.getClass();

        Class c0=Person.class;//通过类名.class创建指定类的class实例

        Class c1=p.getClass();//通过一个类的实例对象的getClass()方法，获取对应实例对象的类的Class实例

        try {
            //通过Class的静态方法来获取一个类的Class实例
            //forName("day8.Person")方法中的参数是你要获取的Class实例的全路径（包名.类名）
            Class c2=Class.forName("day8.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
