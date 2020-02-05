package day5.test;

import day5.MyException;

public class Test2 {
    int age;

    public static void main(String[] args) {
        Test2 t=new Test2();
        try {
            t.test2(-100);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getId());
        }
    }

    public void test2(int age) throws MyException {
        if (age>=0 && age<=150){
            this.age=age;
            System.out.println("年龄是："+this.age);
        }else {
            throw new MyException("年龄在0到150之间",1);
        }
    }


}
