package day7;
/**
 * 文件自己流非常通用，可以用来操作字符的文档，还可以操作任何的其他类型文件，因为字节流直接使用二进制
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) {
        Test1.testFileOutputStream();
        Test1.testFileInputStream();
        Test1.copyFile("D:\\test\\abc\\1.png","D:\\test\\abc\\cc\\1.png");
    }

    /**
     * 文件字节输入流
     */
    public static void testFileInputStream(){
        try {
            FileInputStream in =new FileInputStream("D:\\test\\abc\\tt1.txt");

            byte[] b=new byte[32];//设置一个比特数组，接受读取的文件的内容

            int len=0;//设置一个读取数据的长度
//          in.read(b);//读该方法有一个返回值，是读取了数据的长度，读取到最后一个数据，还会向后读一个，返回值为-1，也就意味着当in.read的返回值是-1时，说明读取完了
            while((len=in.read(b)) != -1){
                System.out.println(new String(b,0,len));
                //输出new String,参数1是缓冲数据的数组，参数2是从数组的哪个位置开始转化字符串，参数三是总共转换几个字节
            }

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输出流
     */
    public static void testFileOutputStream(){
        try {
            FileOutputStream out =new FileOutputStream("D:\\test\\abc\\tt4.txt");//指定向tt1输出数据
            String str ="sahfdakjshfjsjdaisujalkhjd";
            out.write(str.getBytes());//先将数据写入内存
            out.flush();//将内存中的数据刷写到硬盘中
            out.close();//关闭流


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 复制文件到指定位置
     * @param inPath  源文件的路径
     * @param outPath 目标路径
     */
    public static void copyFile(String inPath,String outPath){
        try {
            FileInputStream in =new FileInputStream(inPath);  //读取的源文件
            FileOutputStream out =new FileOutputStream(outPath); //复制到哪里

            byte[] b=new byte[32];
            int len=0;
            while((len=in.read(b)) != -1){
                out.write(b,0,len);//参数1是写的缓冲数组，参数2是从数组的哪个位置开始，参数上是写的总长度
            }
            out.flush();//把写到内存的数据刷写到硬盘
            out.close();
            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
