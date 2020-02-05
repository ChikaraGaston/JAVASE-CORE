package day5.test;
import day5.Person;
import java.util.Set;
import java.util.TreeSet;



public class TestTreeSet1 {


    public static void main(String[] args) {
        Person p1=new Person(23,"张三");
        Person p2=new Person(12,"李四");
        Person p3=new Person(56,"王五");
        Person p4=new Person(22,"LUCY");


        Set<Person> set=new TreeSet<Person>(new Person());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Person p:set){
            System.out.println(p.name+"  "+p.age);
        }
    }
}
