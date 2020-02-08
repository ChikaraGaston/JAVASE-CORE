package day8;

/**
 * 一个java项目，其中有100个java类，每个类有10个方法，一共就有1000个放法
 * 现在有这样的需求，需要每个java方法上加2句话，在方法执行前输出这个方法开始执行，在方法执行后，输出 这个方法已经完成
 *  ？？？
 *  1、挨个方法改（不可取）
 *  2、动态代理
 */
public class TestDemoImpl implements ITestDemo{
    @Override
    public void test1() {
        System.out.println("执行test1方法");
    }

    @Override
    public void test2() {
        System.out.println("执行test2方法");
    }
}
