package day2.test;

import day2.Cylinder;
import day2.Mankind;
import day2.Person;
import day2.Student;

public class Test2 {
    /**
     * 不确定方法传递的类是谁，但确定一定是一个类
     * @param obj
     */
    public void test(Object obj){
        System.out.println(obj.hashCode());
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        Person p= new Person();
        Student s=new Student();
        Cylinder cy=new Cylinder(4,1);

        t.test(cy);
    }
}
