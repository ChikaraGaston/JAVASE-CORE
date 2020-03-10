package com.atguigu.java;

public class Swap {
    public static void main(String[] args) {
        int a=1,b=3;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+" "+y);
    }
}
