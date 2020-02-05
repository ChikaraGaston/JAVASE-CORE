package day7;

import java.io.*;

/**
 * 缓冲字符流
 *
 * 缓冲流是基于内存的
 */

public class TestBufferedRW {
    public static void main(String[] args) {
//        TestBufferedRW.testBufferedReader();
//        TestBufferedRW.testBufferedWriter();
          TestBufferedRW.copyFile();
    }

    /**
     * 缓冲字符输入流
     */
    public static void testBufferedReader(){
        try {
            FileReader fr=new FileReader("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt1.txt");

            BufferedReader br=new BufferedReader(fr);
            char[] ch=new char[20];
            int len=0;
            while((len=br.read(ch)) !=-1){
                System.out.println(new String(ch,0,len));
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字符输出流
     */

    public static void testBufferedWriter(){
        try {
            FileWriter fw=new FileWriter("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt3.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            String s="fgsgsgssdawdasd";
            bw.write(s);
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字符流复制文件
     *
     */

    public static void  copyFile(){
        try {
            BufferedReader br=new BufferedReader
                    (new FileReader("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt1.txt"));
            BufferedWriter bw=new BufferedWriter
                    (new FileWriter("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt4.txt"));

            char[] ch=new char[20];
            int len=0;
            while ((len=br.read(ch)) != -1){
                bw.write(ch,0,len);
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
