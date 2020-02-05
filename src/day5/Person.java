package day5;
import java.util.Comparator;

/**
 * 定制排序
 */
public class Person implements Comparator<Person> {//想要把Person对象存在TreeSet中，并且按照年龄排序，需要其实现一个接口
    public int age;
    public String name;

    public Person(){

    }

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else {
            return 0;
        }
    }
}
