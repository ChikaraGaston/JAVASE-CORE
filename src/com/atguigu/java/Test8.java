package com.atguigu.java;

/**
 * 基本数据类型传递
 */
public class Test8 {

    public static void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
        System.out.println("方法体中："+i+"\t"+j);
    }
    public static void main(String[] args) {
        int b=5;
        int a=0;
        //在栈中开辟一块内存，存值为0
        swap(a,b);
        //调用方法，执行int i部分，此时会开辟一块新的内存地址，其对应的值是从a复制过来的0
        //然后再根据方法体，将i的值与j的值交换，此时i=5，但是由于两者的内存地址并不相同，故main方法里的a值并不改变
        System.out.println("主函数中："+a+"\t"+b);
    }
}
