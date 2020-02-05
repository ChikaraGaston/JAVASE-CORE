package day4;

public class TestInImpl implements TestIn,TestIn1{
    @Override
    public void test() {
        System.out.println("1111111");
    }

    @Override
    public void test1() {
        System.out.println(222222222);
    }
}
