package com.atguigu.java;

public class ABDiamond {
    public static void main(String[] args) {
        // 1 输出上半部分
        int starLine = 19;
        for (int i = 1; i <= starLine; i++) {
            // 1.1 输出空白部分
            for (int j = 0; j <= starLine - i; j++) {
                System.out.print("A");
            }
            //输出空字符串
            for (int m = 1; m <= 5; m++) {
                System.out.print(" ");
            }
            // 1.2 输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            //输出空字符串
            for (int n = 1;n <= 5 ; n++) {
                System.out.print(" ");
            }
            //输出右侧A
            for (int j = 0; j <= starLine - i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        // 2 输出下半部分
        for (int i = 1; i <= starLine - 1; i++) {
            // 2.1 输出A
            for (int j = 0; j <= i; j++) {
                System.out.print("A");
            }
            //输出空串
            for (int m= 1; m <= 5 ; m++) {
                System.out.print(" ");
            }
            // 2.2 输出*
            for (int k = 1; k <= (-2 * i + 2 * starLine - 1); k++) {
                System.out.print("*");
            }
            //输出空串
            for (int k= 1; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
