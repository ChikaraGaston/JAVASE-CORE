package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * java集合类存放在 java.util包中，是一个用来存放对象的容器。
 *          1.集合只能存放对象
 *          2.集合存放的是多个对象的引用，对象本身不在这，在堆中
 *          3.集合可以存放不同类型、不限数量的数据类型
 *
 * java集合中可以分为Set\List\Map三种体系：
 *          set：无序、不可重复的集合
 *          List：有序、可以重复的集合
 *          Map：具有映射关系的集合
 *
 * 泛型：java集合可以记住容器中对象的数据类型
 *
 *
 *
 * HashSet 是 Set 接口的典型实现，大多数时候使用 Set 集合时都使用这个实现类。我们大多数时候说的set集合指的都是HashSet
 * HashSet 按 Hash 算法来存储集合中的元素，因此具有很好的存取和查找性能。
 * HashSet 具有以下特点：
 *    不能保证元素的排列顺序
 *    不可重复
 *    HashSet 不是线程安全的
 *    集合元素可以使 null
 *
 * 当向 HashSet 集合中存入一个元素时，HashSet 会调用该对象的 hashCode() 方法来得到该对象的 hashCode 值，然后根据 hashCode 值决定该对象在 HashSet 中的存储位置。
 * 如果两个元素的 equals() 方法返回 true，但它们的 hashCode() 返回值不相等，hashSet 将会把它们存储在不同的位置，但依然可以添加成功。
 *
 * 存在set集合中的哪个位置由hashcode决定
 *
 */
public class Collections11 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("s");
        list.add("a");
        list.add("123");

        System.out.println(Collections.frequency(list,"a"));
        Collections.replaceAll(list,"a","aa");
        System.out.println(list);

//        System.out.println(list);
//
//        //翻转
//        Collections.reverse(list);
//        System.out.println(list);
//
//        //随机排序
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        //升序排列
//        Collections.sort(list);
//        System.out.println(list);
//
        Student s1=new Student(14,"张三");
        Student s2=new Student(334,"李四");
        Student s3=new Student(112,"王五");
        Student s4=new Student(15,"Lisa");

        List<Student> s=new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
//
//        for (Student ss:s){
//            System.out.println(ss.name+","+ss.age);
//        }
//        System.out.println();
//
//
//        Collections.sort(s,new Student());
//        for (Student ss:s){
//            System.out.println(ss.name+","+ss.age);
//        }
//
//        Collections.swap(list,0,4);
//        System.out.println(list);


        Student sss=Collections.max(s,new Student());
        System.out.println(sss.name+","+sss.age);

        Student ssss=Collections.min(s,new Student());
        System.out.println(ssss.name+","+ssss.age);
    }
}

class Student implements Comparator<Student>{
    int age;
    String name;

    public Student(){

    }
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age>o2.age){
            return 1;
        }else if (o1.age<o2.age){
            return -1;
        }else {
            return 0;
        }
    }
}
