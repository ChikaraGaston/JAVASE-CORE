package day9;

/**
 * 通过实行Runnable接口的方式实现多线程
 */
public class TestRunnable implements Runnable{

    int count=0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Runnable多线程运行的主逻辑");
        for (int i=0;i<5;i++){
            count++;
            System.out.println(Thread.currentThread().getName()+"这是Runnable多线程的逻辑代码"+count);
        }
    }
}
