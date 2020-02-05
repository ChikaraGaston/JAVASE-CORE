package day5.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");//第一个索引下标0
        list.add("b");//第二个索引下标为1
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("f");
        System.out.println(list.get(2));

        System.out.println(list);

        list.add(1,"f");
        System.out.println(list);

        List<String> l=new ArrayList<String>();
        l.add("123");
        l.add("456");

        list.addAll(2,l);
        System.out.println(list);

        System.out.println(list.indexOf("a"));//获取指定元素在集合中第一次出现的索引下标
        System.out.println(list.lastIndexOf("a"));//获取指定元素在集合中最后一次出现的索引下标

        list.remove(2);//根据索引下标移除某些元素
        System.out.println(list);

        list.set(1,"ffff");//根据索引下标修改某些元素
        System.out.println(list);

        //根据索引下标的起始位置，截取List集合，形成新的集合，截取时包含开始的索引，但不包含结束的索引
        List<String> sub= list.subList(2,4);
        System.out.println(sub);


        System.out.println(list.size());

        ListIterator<String> it=list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
