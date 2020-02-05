package day5.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        //添加
        Set set=new HashSet();
        set.add(1);
        set.add(1);
        set.add("a");

        System.out.println(set);

        //移除
        set.remove(1);
        System.out.println(set);

        //判断是否包含
        System.out.println(set.contains("a") );

        //清空
        set.clear();
        System.out.println(set);

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d");//重复添加没有用
        set.add(null);//集合可以添加null
        set.add(false);//可以存布尔值
        System.out.println(set);

        //使用迭代器遍历
        Iterator it =set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        //for each迭代集合
        for (Object obj:set){//把set的每一个值取出来赋值给obj，直到把所有值都循环一边
            System.out.println(obj);
        }

        //集合大小
        System.out.println(set.size());
    }
}
