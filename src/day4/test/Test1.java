package day4.test;

/**
 * 倘若子类已经开始使用父类的部分功能，而父类有添加了新的抽象功能，此时子类便不可用了
 * 解决这种情况我们会选择通过接口实现多重继承
 */
public abstract class Test1 {
    public abstract void test();
    public abstract void test1();
}
class Test1Child extends Test1{

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }

    public static void main(String[] args) {
        Test1Child c=new Test1Child();
    }
}