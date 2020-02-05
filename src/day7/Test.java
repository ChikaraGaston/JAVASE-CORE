package day7;

import java.io.File;
import java.io.IOException;

/**
 * File 类代表与平台无关的文件和目录。
 * File  能新建、删除、重命名文件和目录，但 File 不能访问文件内容本身。如果需要访问文件内容本身，则需要使用输入/输出流。
 * 你可以把一个日记本放在各种地方，但是不能写日记
 */

public class Test {
    public static void main(String[] args) {
//        File f = new File("D:\\test\\abc\\tt1.txt");
//
//        System.out.println(f.getName());
//        System.out.println(f.getAbsoluteFile());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f);
//        System.out.println(f.getPath());
//        System.out.println(f.getParent());
//
////        f.renameTo(new File("D:\\test\\abc\\tt1.txt"));
//
//        System.out.println(f.exists());
//        System.out.println(f.lastModified());
//        System.out.println(f.length());
////        System.out.println(f.list());
//
//        File f1 = new File("D:\\test\\abc\\tt2.txt");
//        if (!f1.exists()) {//判断文件是否存在
//            try {
//                f1.createNewFile();//创建新文件
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        f1.delete();
//
//        File f2 = new File("D:\\test\\abc\\cc");
//        f2.mkdir();//创建单层目录,创建多层目录需要一层一层执行
//
//
//        File f3 = new File("D:\\test\\abc\\a\\b\\c");
//        f3.mkdirs();//创建多层目录
//
//        File f4 = new File("D:\\test");
//
//        String[] s = f4.list();
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//
//        File[] ff=f4.listFiles();
//        for (File fs:ff){
//            System.out.println(fs);
//        }

        File f = new File("D:\\test");
        new Test().test(f);

    }

    /**
     * 递归遍历文件
     */
    public void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath()+"是文件");
        }else {
            System.out.println(file.getAbsolutePath()+"是文件夹");
            //如果是文件夹，这个文件里就有可能有子文件夹或者文件
            File[] fs=file.listFiles();
            if (fs !=null&&fs.length>0){
                for (File ff:fs){
//                    if (file.isFile()){
//                        System.out.println(file.getAbsolutePath()+"是文件");
//                    }else{
//                        System.out.println(file.getAbsolutePath()+"是文件夹");
//                    }
                    test(ff);//递归！
                }
            }
        }
    }



}
