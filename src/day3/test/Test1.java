package day3.test;

import com.sun.media.jfxmediaimpl.HostUtils;
import day2.test.Test;
import day3.Person;
import day3.Student;

/**
 * 子类赋值给父类可以自己转换
 * 父类赋值给子类则需要强制类型转换，即造型
 */
public class Test1 {
//    Student s=new Student();
//    Person p=s;
//    Person p=new Person();
//    Student s= (Student) p;


    public static void main(String[] args) {
        Test1 t=new Test1();

        t.method(new Student());
    }

    public void method(Person e){
        if (e instanceof Student){
//            ((Student) e).getSchool();
            Student s= (Student) e;
            s.getSchool();
        }else {
            e.test();
        }
    }

}

