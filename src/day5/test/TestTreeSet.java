package day5.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用treeset需要注意必须放入同样类的对象。通过泛型来进行限制
 */

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<Integer>();

        //TreeSet自然排序
        set.add(5);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

//        set.remove(5);
//        System.out.println(set);
//
//        System.out.println(set.contains(3));
//
//        set.clear();
//        System.out.println(set);


        //迭代器
        Iterator<Integer> it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for each
        for (Integer i:set){
            System.out.println(i);
        }
    }
}
