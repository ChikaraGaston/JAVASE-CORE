package day5.test;

/**
 * 抛出异常
 *
 * 假设父类的某个方法抛出异常，子类继承的时候重写，也需要抛出异常
 *
 * 子类重写父类方法，子类不能抛出比父类方法更大范围的异常
 */
public class Test1 {
    public static void main(String[] args){//可以在main上继续抛出异常，但是会抛到JVM中，程序无法处理
//        B b=new B();
//        try{
//            b.test();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       // b.test();

        B b=new B();
        try {
            b.testt(-100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B{
    int i;
    int age;
    public void  test() throws NullPointerException{//可以使用throws在代码这抛出异常，在调用方去捕获处理
        B b=null;
        System.out.println(b.i);
    }

    //手动抛出异常
    public void testt(int age) throws Exception {
        if (age>=0 && age<=150){
            this.age=age;
            System.out.println("年龄是："+this.age);
        }else {
            throw new Exception("年龄在0到150之间");
        }
    }
}
class C extends B{
    @Override
    public void test() throws NullPointerException {//子类重写父类方法，子类不能抛出比父类方法更大范围的异常

    }
}