package com.atguigu.java;

public class Animal {
    String name;
    int eye;
    int legs;


    public String getName(){
        return name;
    }
    public void eat(String food){
        System.out.println(name+"喜欢吃："+food);
    }

    public void move(String moveType){
        System.out.println(name+"的移动方式："+moveType);
    }

    public int showLegs(){
        return legs;
    }

}
