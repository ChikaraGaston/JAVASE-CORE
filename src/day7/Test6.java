package day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化与反序列化
 *
 * 对象的序列化与反序列化使用的类要严格一致，包名，类名，类结构名称，所有都要一致，不然会出现异常
 */
public class Test6 {
    public static void main(String[] args) {
        try {
//            Test6.testSerialize();
            Test6.testDeserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对象输出流
     * 对象的序列化
     * @throws Exception
     */
    public static void testSerialize() throws  Exception{

        //定义对象的输出流，把对象序列化之后的流放在指定的文件中
        ObjectOutputStream out =new ObjectOutputStream
                (new FileOutputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt9.txt"));

        Person p=new Person();
        p.name="张三";
        p.age=11;

        out.writeObject(p);
        out.flush();
        out.close();
    }

    /**
     * 对象的反序列化
     */
    public static void testDeserialize() throws  Exception{
        /**
         * 创建对象输入流的对象，从指定的文件中把对象序列化后的流进行读取
         */
        ObjectInputStream in =new ObjectInputStream
                (new FileInputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt9.txt"));

        Object o=in.readObject();
        Person p= (Person) o;
        System.out.println(p.age);
        System.out.println(p.name);
        in.close();
    }
}
