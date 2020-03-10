package com.atguigu.java;

public class Arry1 {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,2,4},
                {7,8},
                {6}
        };
        int res=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                res+=arr[i][j];
            }
        }
        System.out.print(res);


    }
}
