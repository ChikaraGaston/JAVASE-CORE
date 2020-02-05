package day7;
/**
 * 字符流只适合于拷贝字符流文件
 * 写入文件，同名会覆盖
 * 读取文件把必须保证目录中有该文件
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        Test2.testFileReader("D:\\test\\abc\\tt1.txt");
        Test2.testFileWriter("sdasjkdhsajkhdkasjhdksahdkashdkjashdkj","D:\\test\\abc\\tt5.txt");
        Test2.copyFile("D:\\test\\abc\\tt1.txt","D:\\test\\abc\\tt3.txt");
    }

    /**
     * 文件字符输入流
     * @param inPath
     */
    public static void testFileReader(String inPath){
        try {
            FileReader fr=new FileReader(inPath);//创建字符输入流的对象

            char[] ch=new char[32];//创建临时存数据的数组
            int len=0;

            while((len=fr.read(ch)) != -1){
                System.out.println(new String(ch,0,len));
            }

            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 文件字符输出流
     * @param text
     * @param outPath
     */
    public static void testFileWriter(String text,String outPath){
        try {
            FileWriter fw=new FileWriter(outPath);

            fw.write(text);//写到内存中
            fw.flush();//刷到硬盘
            fw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 复制文件到指定位置
     * @param inPath
     * @param outPath
     */
    public static void copyFile(String inPath,String outPath){
        try {
            FileReader fr=new FileReader(inPath);
            FileWriter fw=new FileWriter(outPath);

            char[] ch=new char[32];//创建临时存数据的数组
            int len=0;

            while((len=fr.read(ch)) != -1){
                fw.write(ch,0,len);
            }
            fw.flush();
            fw.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
