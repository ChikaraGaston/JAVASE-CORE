package com.atguigu.java;

public class HollowDiamond {
    public static void main(String[] args) {
        // 定义上部分输出的行数
        int starLine = 5;    //改变starLine的值输出不同大小的效果
        // 1 输出上部分
        for (int i = 1; i <= starLine; i++) {
            // 1.1 输出左侧的空格
            for (int j = 1; j <= starLine - i; j++) {
                System.out.print(" ");
            }
            // 1.2 输出左侧的*
            System.out.print("*");
            // 1.3 输出中间的空格
            for (int k = 2; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }
            // 1.4 输出右侧的*
            if (i >= 2) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 2 输出下部分
        for (int i = 1; i <= starLine - 1; i++) {
            // 2.1 输出左侧的空格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 2.2 输出左侧的*
            System.out.print("*");
            // 2.3 输出中间的空格
            for (int k = 1; k <= ((2 *starLine)-3-(2 * i)); k++) {
                System.out.print(" ");
            }
            // 2.4输出右侧的*
            if (i <= starLine - 2) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
