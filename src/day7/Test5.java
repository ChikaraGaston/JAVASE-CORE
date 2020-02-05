package day7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据流，专门用来做基本数据类型的读写
 */
public class Test5 {
    public static void main(String[] args) {
        try {
//            Test5.testDataOutputStream();
            Test5.testDataInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 数据输出流
     * 用数据输出流写到文件的基本数据类型是乱码，不能直接辨认出来
     * 需要数据输入流进行读取
     * DataOutputStream
     */
    public static void testDataOutputStream() throws Exception{
        DataOutputStream out =new DataOutputStream
                (new FileOutputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt8.txt"));

        out.writeBoolean(true);
        out.writeDouble(1.35d);
        out.writeInt(100);
        out.flush();
        out.close();
    }


    public static void testDataInputStream() throws Exception{
        DataInputStream in=new DataInputStream
                (new FileInputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt8.txt"));


        System.out.println(in.readBoolean());
        System.out.println(in.readDouble());
        System.out.println(in.readInt());


        in.close();
    }
}
