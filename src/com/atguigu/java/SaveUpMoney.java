package com.atguigu.java;

public class SaveUpMoney {

    public static void main(String[] args) {
        moneyFor();
        moneyWhile();
        moneyDoWhile();
    }
        private static void moneyFor(){
        double sum=0;
        int i=1;
        for (i=1;sum<100;i++){
            sum+=2.5;
            if (i%5==0){
                sum-=6;
            }
        }
            System.out.println("钱的总数是："+sum);
            System.out.println("存了"+(i-1)+"天");
        }

        private static void moneyWhile(){
        double sum=0;
        int i=1;
        while (sum<100){

            sum+=2.5;
            if(i%5==0){
                sum-=6;
            }
            i++;

        }

            System.out.println("钱的总数是："+sum);
            System.out.println("存了"+(i-1)+"天");
        }

        private  static void moneyDoWhile(){
        double sum=0;
        int i =1;
        do {
            sum+=2.5;
            if (i%5==0){
                sum-=6;
            }
            i++;
        }while (sum<100);

            System.out.println("钱的总数是："+sum);
            System.out.println("存了"+(i-1)+"天");
        }
}
