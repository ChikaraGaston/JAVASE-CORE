package day9;

/**
 * 继承Thread类方式实现多线程
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println("线程运行的主逻辑");
        for (int i=0;i<5;i++){
            System.out.println("这是多线程的逻辑代码"+i);
        }
    }
}
