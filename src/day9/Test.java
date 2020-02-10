package day9;

public class Test {
    public static void main(String[] args) {
        //对象的多态
//        Thread t0=new TestThread();  //继承Thread类的线程
////        new Test().test();//同步
//
//        t0.start();//启动线程，开始运行run方法里面的代码

        Runnable run=new TestRunnable();
        Thread t3=new Thread(run,"t-1");
        t3.start();

        Thread t4=new Thread(run,"t-2");
        t4.start();

        System.out.println("------------------------1");
        System.out.println("------------------------2");
        System.out.println("------------------------3");

        /**
         * 多次运行这个main方法之后
         * main方法和run方法的打印顺序是不固定的
         * mai执行t0.start方法开启线程之后，相当于main方法之外又开启一个支流
         * 这个时候t0.start方法之后的main方法的其他代码，和run方法无关了
         *
         * 就像两条河流一样各走各的，是并行的
         *
         * 各自保持自己的输出顺序
         * 这个体现了多线程的异步性
         */
    }

    public void test(){
        System.out.println("线程运行的主逻辑");
        for (int i=0;i<5;i++){
            System.out.println("这是多线程的逻辑代码"+i);
        }
    }
}
