package com.atguigu.java;

public class Arry {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static  void change(int[] array){
        array[0]=0;
    }
}
