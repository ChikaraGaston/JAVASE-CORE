package day2.test;

import day2.Graduate;
import day2.Student;
import day2.Teacher;
import day2.Worker;

public class Tset {


    public static void main(String[] args) {
        Student s=new Student();
        s.setSchool("烟台大学");
        s.setName("fg");
        s.setAge(11);
        s.setSex(1);


        Teacher t=new Teacher();
        t.setSubject("数学");
        t.setName("fgcg");
        t.setAge(12);
        t.setSex(0);



        Worker w=new Worker();
        w.setProfession("工程师");
        w.setName("fgcp");
        w.setAge(22);
        w.setSex(0);

        Graduate g=new Graduate();
        g.setMajor("计算机");
        g.setSchool("烟台大学");
        g.setName("fgfg");
        g.setAge(12);
        g.setSex(1);

        s.showInfo();
        System.out.println();
        t.showInfo();
        System.out.println();
        w.showInfo();
        System.out.println();
        g.showInfo();
    }
}
