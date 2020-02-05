package day7;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        try {
//            Test4.test();
            Test4.test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 一个简单标准的输入流
     * @throws Exception
     */
    public static void testSystemIn() throws Exception{
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is=new InputStreamReader(System.in);
        //把输入流放到缓冲流
        BufferedReader br=new BufferedReader(is);

        String str="";
        while((str =br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
        is.close();
    }

    /**
     * 练习1，把控制台输入的内容写到指定的TXT文件中
     *
     * 当接收到字符串over以后，程序结束运行
     */
    public static void test() throws Exception{
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is=new InputStreamReader(System.in);
        //把输入流放到缓冲流
        BufferedReader br=new BufferedReader(is);

        BufferedWriter bw=new BufferedWriter
                (new FileWriter("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt7.txt"));

        String str="";
        while ((str=br.readLine()) !=null){
            if (str.equals("over")){
                break;
            }
            //读取的每一行都写入到指定的txt文件中
            bw.write(str);
        }

        bw.flush();
        bw.close();
        br.close();
        is.close();
    }


    /**
     * 练习2，在txt文件中，写一组用户名和密码，通过控制条输入用户名和密码，然后与txt文件中的用户名密码作对比，如果一样就打印登陆成功
     * 如果不一致，打印登录失败，用户名密码错误
     */

    public static void test1() throws Exception{

        System.out.println("请输入用户名：");
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is=new InputStreamReader(System.in);
        //把输入流放到缓冲流
        BufferedReader br=new BufferedReader(is);
        String user=br.readLine();

        System.out.println("请输入密码：");
        InputStreamReader is1=new InputStreamReader(System.in);
        //把输入流放到缓冲流
        BufferedReader br2=new BufferedReader(is1);
        String pwd=br2.readLine();

        String s3=user+","+pwd;

        BufferedReader brtxt=new BufferedReader
                (new FileReader("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt8.txt"));
        String s=null;
        String result="";
        while((s=brtxt.readLine()) !=null){
            result = result +s;
        }


        if (s3.equals(result)){
            System.out.println("账号登陆成功");
        }else {
            System.out.println("用户名或密码错误");
        }

        brtxt.close();
        br2.close();
        is1.close();
        br.close();
        is.close();
        
    }
}
