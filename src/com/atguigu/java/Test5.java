package com.atguigu.java;

public class Test5 {
    public static void main(String[] args) {
        char ch='C';
        switch(ch){
            case 'A':
                System.out.println("wrong");
                break;
            case 'B':
                System.out.println("wrong");
                break;
            case 'C':
                System.out.println("true");
                break;
            case 'D':
                System.out.println("wrong");
                break;
            default:
                System.out.println("no choice");
        }

    }
}
