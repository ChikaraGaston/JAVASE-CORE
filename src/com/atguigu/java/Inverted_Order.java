package com.atguigu.java;

public class Inverted_Order {
    public static void main(String[] args) {

        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
                arr[i]=i;
                System.out.println(arr[i]);
            }
        System.out.println();
        int k=0;
        int[] temp=new int[arr.length];
        for(int j=arr.length-1;j>=0;j--){
            temp[k]=arr[j];
            k++;
        }
        arr=temp;
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }
}
