package day7;

/**
 *  RandomAccessFile 类支持 “随机访问” 的方式，程序可以直接跳到文件的任意 地方来读、写文件
 *      支持只访问文件的部分内容
 *      可以向已存在的文件后追加内容
 *          RandomAccessFile 对象包含一个记录指针，用以标示当前读写处的位置。
 *          RandomAccessFile 类对象可以自由移动记录指针：
 *              long getFilePointer()：获取文件记录指针的当前位置
 *              void seek(long pos)：将文件记录指针定位到 pos 位置
 */


import java.io.RandomAccessFile;

/**
 * 文件的随机读取
 */
public class Test7 {
    public static void main(String[] args) {
        try {
//            Test7.testRandomAccessFileRead();
            Test7.testRandomAccessFileWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testRandomAccessFileRead() throws Exception{
        //RandomAccessFile
        //参数一是文件路径
        //参数二是方式，即访问模式
        /**
         *      !! r: 以只读方式打开
         *      !! rw：打开以便读取和写入
         *       rwd:打开以便读取和写入；同步文件内容的更新
         *      rws:打开以便读取和写入；同步文件内容和元数据的更新
         */
        RandomAccessFile ra=new RandomAccessFile
                ("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt10.txt","r");

        ra.seek(8);//设置文件读取内容的起始点
        //随机就在这里体现了
        //注意换行符 、\t

        byte[] b=new byte[1024];
        int len=0;
        while((len=ra.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        ra.close();
    }

    /**
     * 随机写
     */
    public static void testRandomAccessFileWriter() throws Exception{
        RandomAccessFile ra=new RandomAccessFile
                ("D:\\JAVA\\IntelliJ Idea\\IdeaProjects\\javaSenior\\src\\day7\\tt10.txt","rw");

  //      ra.seek(0);//设置写的起始点，0代表从开头写
        ra.seek(ra.length());//设置写的起始点，ra.length()代表从文件的最后结尾开始写

        ra.write("你好".getBytes());
        ra.close();
    }
}



// 字节流-缓冲流（重点）
//          输入流InputStream-FileInputStream-BufferedInputStream
//          输出流OutputStream-FileOutputStream-BufferedOutputStream
// 字符流-缓冲流（重点）
//           输入流Reader-FileReader-BufferedReader
//           输出流Writer-FileWriter-BufferedWriter
// 转换流
//           InputSteamReader和OutputStreamWriter
//  对象流ObjectInputStream和ObjectOutputStream（难点）
//           序列化
//          反序列化
// 随机存取流RandomAccessFile（掌握读取、写入）