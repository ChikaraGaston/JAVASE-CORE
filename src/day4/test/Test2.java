package day4.test;
/**
 * 抽象类时对一类事物的高度抽象，有属性，有方法
 * 接口更加简化，其是对一系列动作的抽象
 * 当需要对一类事物进行抽象的时候，选择抽象类
 * 其他情况可以选择接口的方式来实现
 *
 */

import day4.Cooking;
import day4.SCTeacher;

public class Test2 {
    public static void main(String[] args) {
        SCTeacher sc=new SCTeacher();
        sc.setInfo();
        sc.showInfo();
        sc.fry();
        sc.singiung();

        //对象的多态
        Cooking cc=new SCTeacher();
        cc.fry();
    }
}
