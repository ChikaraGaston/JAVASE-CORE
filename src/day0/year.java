package day0;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份:");
        int month=sc.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("现在是春天");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("现在是夏天");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("现在是秋天");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("现在是冬天");
                break;
            default:
                System.out.println("finish");
        }
    }
}
