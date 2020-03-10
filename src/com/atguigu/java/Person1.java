package com.atguigu.java;

public class Person1 {

    public String name;
    public int age;
    public int sex;

    public void study() {
        System.out.println(name+"正在studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age+=i;
        return age;
    }

}
