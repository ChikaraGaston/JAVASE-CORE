package com.atguigu.java;

public class DiamondStar {
    public static void main(String[] args) {
        // 1 输出上半部分
        int starLine = 11;   //改变starLine的值数出不同的效果
        for (int i = 1; i <= starLine; i++) {
            // 1.1 输出空白部分
            for (int j = 1; j <= starLine - i; j++) {
                System.out.print(" ");
            }
            // 1.2 输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 2 输出下半部分
        for (int i = 1; i <= starLine - 1; i++) {
            // 2.1 输出空格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 2.2 输出*
            for (int k = 1; k <= (2*(starLine - 1)-(2*i)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
