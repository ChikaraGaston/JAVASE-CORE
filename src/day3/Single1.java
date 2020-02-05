package day3;

/**
 * 懒汉式模式设计
 */
public class Single1 {
    private static Single1 instance=null;
    private Single1(){

    }
    public static Single1 getInstance(){
        if (instance==null){
            instance=new Single1();
        }
        return instance;
    }

}
