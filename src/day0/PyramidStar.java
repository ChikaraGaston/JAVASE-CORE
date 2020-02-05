package day0;

public class PyramidStar {
    public static void main(String[] args) {
        int starLine = 9;   //改变starLine的值输出不同大小的效果
        for (int i = 1; i <= starLine; i++) {
            // for循环输出空格
            for (int j = 1; j <= starLine - i; j++) {
                System.out.print(" ");
            }
            // for循环输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
