package day9;

public class Test2 {
    public static void main(String[] args) {
        //定义账户对象
        Acount a=new Acount();
        Acount a1=new Acount();

        //多线程对象
        User u_wechat=new User(a,2000);
        User u_alipay=new User(a1,2000);

        Thread wechat=new Thread(u_alipay,"微信");
        Thread alipay=new Thread(u_alipay,"支付宝");

        wechat.start();
        alipay.start();
    }
}

class Acount{
    public static int money=3000;

    /**
     * 提款方法，判读账户的钱够不够
     * 线程共享资源，一个线程执行这个方法没有完毕，另一个线程又开始执行该方法
     * 解决方法
     * 一个线程整体执行完毕，另一个线程再执行
     * 通过synchronized()同步锁来完成，锁的是整个对象，而不是方法,不同的对象，就是不同的锁
     * 可以直接在方法上加上关键字synchronized
     * @param m
     */
    public synchronized void drawing(int m){
        String name=Thread.currentThread().getName();

        if (money<m){
            System.out.println(name+"操作，账户余额不足："+money);
        }else {
            System.out.println(name+"操作，账户原有金额："+money);
            System.out.println(name+"操作，取款金额："+m);

            System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
            money=money-m;
            System.out.println(name+"操作，取款后余额："+money);
        }
    }

    public synchronized void drawing1(int m){
        String name=Thread.currentThread().getName();

        if (money<m){
            System.out.println(name+"操作，账户余额不足："+money);
        }else {
            System.out.println(name+"操作，账户原有金额："+money);
            System.out.println(name+"操作，取款金额："+m);

            System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
            money=money-m;
            System.out.println(name+"操作，取款后余额："+money);
        }
    }

    /**
     * 静态的方法加关键字，对所有的对象都是同一个锁
     * @param m
     */
    public static synchronized void drawing2(int m){
        String name=Thread.currentThread().getName();

        if (money<m){
            System.out.println(name+"操作，账户余额不足："+money);
        }else {
            System.out.println(name+"操作，账户原有金额："+money);
            System.out.println(name+"操作，取款金额："+m);

            System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
            money=money-m;
            System.out.println(name+"操作，取款后余额："+money);
        }
    }

    public  void drawing3(int m){
        //用this锁代码块代表当前的对象，如果在其他方法中也有synchronized的代码块使用飞都是同一个同步锁
        synchronized(this){
            String name=Thread.currentThread().getName();

            if (money<m){
                System.out.println(name+"操作，账户余额不足："+money);
            }else {
                System.out.println(name+"操作，账户原有金额："+money);
                System.out.println(name+"操作，取款金额："+m);

                System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
                money=money-m;
                System.out.println(name+"操作，取款后余额："+money);
            }
        }

    }

    public  void drawing4(int m){
        //用this锁代码块代表当前的对象，如果在其他方法中也有synchronized的代码块使用飞都是同一个同步锁
        synchronized(this){
            String name=Thread.currentThread().getName();

            if (money<m){
                System.out.println(name+"操作，账户余额不足："+money);
            }else {
                System.out.println(name+"操作，账户原有金额："+money);
                System.out.println(name+"操作，取款金额："+m);

                System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
                money=money-m;
                System.out.println(name+"操作，取款后余额："+money);
            }
        }
    }

    public  void drawing5(int money,Acount acount){
        //用this锁代码块代表当前的对象，如果在其他方法中也有synchronized的代码块使用飞都是同一个同步锁
        synchronized(acount){
            String name=Thread.currentThread().getName();

            //需求:如果是微信操作，先不执行，等支付宝操作完，微信再继续操作

            if (name.equals("微信")){
                try {
                    acount.wait();//当前的线程进入等待状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (this.money<money){
                System.out.println(name+"操作，账户余额不足："+this.money);
            }else {
                System.out.println(name+"操作，账户原有金额："+this.money);
                System.out.println(name+"操作，取款金额："+money);

                System.out.println(name+"操作，取款操作：原金额"+this.money+"-"+"取款金额"+money);
                this.money=this.money-money;
                System.out.println(name+"操作，取款后余额："+this.money);
            }

            if (name.equals("支付宝")){

               try{
                   acount.notify();//唤醒当前优先级最高的线程，进入就绪状态
               } catch (Exception e){
                   e.printStackTrace();
               }

            }
        }
    }
}

 class User implements Runnable{
    Acount acount;
    int money;
    public User(Acount acount,int money){
        this.acount=acount;
        this.money=money;
    }
     @Override
     public void run() {
//        if (Thread.currentThread().getName().equals("微信")){
//            acount.drawing3(money);
//        }else {
//            acount.drawing4(money);
//        }
//         acount.drawing3(money);
         acount.drawing5(money,acount);
     }
 }
