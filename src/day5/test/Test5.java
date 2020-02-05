package day5.test;
import day5.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        Set<AAA> set=new TreeSet<>();

        set.add(new AAA(12,"fg"));
        set.add(new AAA(13,"ggg"));
        set.add(new AAA(113,"dkahjdklad"));
        set.add(new AAA(55,"jfkhfjdbhjshfgsf"));

        for (AAA a:set){
            System.out.println(a);
        }
    }
}




class AAA implements Comparable{
    int age;
    String name;

    public AAA(){

    }

    public AAA(int age,String name){
        this.age=age;
        this.name=name;
    }


    /**
     * 如果将compareTo()返回值写设置为0，元素值每次比较，都认为是相同的元素，这时就不再向TreeSet中插入除第一个外的新元素。所以TreeSet中就只存在插入的第一个元素。
     * 如果将compareTo()返回值写设置为1，元素值每次比较，都认为新插入的元素比上一个元素大，于是二叉树存储时，会存在根的右侧，读取时就是正序排列的。
     * 如果将compareTo()返回值写设置为-1，元素值每次比较，都认为新插入的元素比上一个元素小，于是二叉树存储时，会存在根的左侧，读取时就是倒序序排列的。

     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof AAA){
            AAA a= (AAA) o;
            return this.name.compareTo(a.name);
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AAA employee = (AAA) o;

        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return false;
    }
}