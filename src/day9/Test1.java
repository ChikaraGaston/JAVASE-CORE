package day9;

public class Test1 {
    public static void main(String[] args) {
        TestRun testRun0=new TestRun();
        TestRun testRun1=new TestRun();

        Thread t0=new Thread(testRun0);
        Thread t1=new Thread(testRun0);

        t0.setName("t0");
        t1.setName("t1");
//
//        t0.setPriority(1);
//        t1.setPriority(10);

        t0.start();
        t1.start();



        System.out.println(t0.getName());
        System.out.println(t1.getName());

        /**
         * 线程优先级，用数组1-10表示，数字越大，优先级越高，如果没有设置，默认是5
         */

        System.out.println("t0的优先级："+t0.getPriority());//获取线程的优先级



        System.out.println("------------------------1");
        System.out.println("------------------------2");

        System.out.println(t1.isAlive());
        t1.stop();


        try {
            t0.join();//run方法代码插入到此位置执行，阻塞main方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------3");
        System.out.println(t1.isAlive());

    }
}

class TestRun implements Runnable{

    int count=0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Runnable多线程运行的主逻辑");
        for (int i=0;i<5;i++){
//            try {
//                Thread.sleep(1000);//当前线程睡眠1秒
//                //每隔1秒执行一次循环
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (i % 2==0){
//                Thread.yield();//线程让步
//                System.out.println("线程让步");
//            }
            count++;
            System.out.println(Thread.currentThread().getName()+"这是Runnable多线程的逻辑代码"+count);
        }
    }

    /**
     * JDK中用Thread.State枚举表示了线程的几种状态
     * 要想实现多线程，必须在主线程中创建新的线程对象。
     * Java语言使用Thread类及其子类的对象来表示线程，在它的一个完整的生命周期中通常要经历如下的五种状态：
     *
     * 新建： 当一个Thread类或其子类的对象被声明并创建时，新生的线程对象处于新建状态
     * 线程实例创建
     *
     * 就绪：处于新建状态的线程被start()后，将进入线程队列等待CPU时间片，此时它已具备了运行的条件
     * 执行.start方法
     *
     * 运行：当就绪的线程被调度并获得处理器资源时,便进入运行状态， run()方法定义了线程的操作和功能
     * run方法的代码开始执行
     *
     * 阻塞：在某种特殊情况下，被人为挂起或执行输入输出操作时，让出 CPU 并临时中止自己的执行，进入阻塞状态
     * 阻塞run方法
     *
     * 死亡：线程完成了它的全部工作或线程被提前强制性地中止
     * .stop方法，或者自然死亡，断电
     */
}
