package day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 所有文件都是有编码格式
 * ISO8859-1，西欧编码，纯英文呢
 * utf-8和GBK这两种编码适用于中英文
 * 其中utf-8更适合中文
 *
 *
 * 转换流提供了字符字节的转换，假设字节流的数据存储的都是字符，那么转换成字符流会更高效
 */
public class Test3 {
    public static void main(String[] args) {
        try {
//            Test3.testInputStreamReader();
              Test3.testOutputStreamWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 转换输入流
     * @throws Exception
     */
    public static void testInputStreamReader() throws Exception{
        FileInputStream fs=new FileInputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt5.txt");
        //把字节流转换为字符流
        InputStreamReader in=new InputStreamReader(fs,"UTF-8");//参数一：字节流，参数二：编码类型
        char[] ch=new char[10];
        int len=0;
        while((len=in.read(ch)) != -1){
            System.out.println(new String(ch,0,len));
        }

        in.close();
        fs.close();
    }


    /**
     * 转换字节输出流
     */
    public static void testOutputStreamWriter() throws Exception{
        FileOutputStream fo=new FileOutputStream("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt6.txt");
        OutputStreamWriter out=new OutputStreamWriter(fo,"UTF-8");

        out.write("你好，你可以走二环");
        out.flush();

        out.close();
        fo.close();
    }
}
