package day4.test;

/**
 *内部类是为了解决java不能多重继承的问题
 */


public class Test4 {
    int i;
    public int z;
    private int k;
    A a=new A();

    class A{
        int i;
        public void setTest3Fileds(){
            Test4.this.i=0;
            Test4.this.z=2;
            Test4.this.k=5;
        }
        public void set(){
            this.i=10;
        }
    }
    //内部类可以声明为final
    //可以声明为private或者protected
    //可以声明为static，但此时不能再使用外层的非静态成员变量
    //可以声明为抽象类，也可以被其他内部类继承
    //外部类可以声明static成员变量，内部类只有是static的情况下才可以

    static class B{

    }

    abstract class C{

    }

    class D extends C{

    }

    public void setInfo(){
        new A().setTest3Fileds();

        a.set();
    }

    public void showInfo(){
        System.out.println(this.i);
        System.out.println(this.z);
        System.out.println(this.k);
        System.out.println(a.i);
    }

    public static void main(String[] args) {
        Test4 t=new Test4();
        t.setInfo();
        t.showInfo();
    }
}
