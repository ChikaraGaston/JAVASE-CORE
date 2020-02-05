package day7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBuffer {
    public static void main(String[] args) {

        try {
//            TestBuffer.testBufferedInputStream();
//            TestBuffer.testBufferedOutputStream();
              TestBuffer.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    /**
     * 缓冲字节输入流
     * BufferedInputStream
     * @throws Exception
     */
    public static void testBufferedInputStream() throws Exception{

        //设置一个文件字节输入流对象
        FileInputStream in=new FileInputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt.txt");

        //设置缓冲字节输入流对象
        //把文件字节输入流放到缓冲字节输入流对象里
        BufferedInputStream br=new BufferedInputStream(in);

        byte[] b=new byte[32];
        int len=0;

        while((len=br.read(b)) !=-1){
            System.out.println(new String(b,0,len));
        }

        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * BufferedOutputStream
     */
    public static void testBufferedOutputStream() throws Exception{
        //创建字节输出流对象
        FileOutputStream out =new FileOutputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt1.txt");

        //创建缓冲字节输出流
        //将out放入缓冲字节输出流
        BufferedOutputStream bo=new BufferedOutputStream(out);
        String s="hello world";
        bo.write(s.getBytes());
        bo.flush();//刷到硬盘中

        bo.close();
        out.close();
    }

    /**
     * 缓冲流实现文件的复制
     */
    public static void copyFile() throws Exception{
        BufferedInputStream br=new BufferedInputStream
                (new FileInputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt1.txt"));

        BufferedOutputStream bo=new BufferedOutputStream
                (new FileOutputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt2.txt"));

        byte[] b=new byte[32];
        int len=0;
        while((len=br.read(b))!=-1){
            bo.write(b,0,len);//写到内存中
        }

        bo.flush();
        bo.close();
        br.close();

    }
}
