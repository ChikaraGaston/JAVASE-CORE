package day6.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        D d=new D();
//        List<String> l1=new ArrayList<String>();
//        d.test(l1);
//
//        List<Integer> l2=new ArrayList<Integer>();
//        d.test(l2);

        List<CC> lc=new ArrayList<CC>();
        List<DD> ld =new ArrayList<DD>();
        d.test1(lc);
        d.test1(ld);

        List<IAImpl> lia =new ArrayList<IAImpl>();
        d.test3(lia);
//        d.test3(lc);

    }
}


/**
 * <? extends Person>     (无穷小 , Person]
 *  只允许泛型为Person及Person子类的引用调用
 *
 *  <? super Person >      [Person , 无穷大)
 *  只允许泛型为Person及Person父类的引用调用
 *
 * <? extends Comparable>
 * 只允许泛型为实 现Comparable接口的实现类的引用调用
 */



class D{
    public void test(List<?> list){//test方法需要一个list集合的参数，不确定list集合到底是存的数据类型是什么

    }

    public void test1(List<?extends CC> list){//list参数的数据类型就是CC及其子类

    }

    public void test2(List<? super CC> list){//list参数的数据类型就是CC及其父类

    }

    public void test3(List<? extends IA> list){//list参数的数据类型就是IA的实现类

    }
}

class AA{ }

class BB extends AA{ }

class CC extends BB{ }

class DD extends CC{ }

interface IA{}

class IAImpl implements IA{}