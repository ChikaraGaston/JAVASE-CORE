package day0;

public class UmbrellaStar {
    public static void main(String[] args) {
        String str = "";
        int starLine = 15; //改变starLine的值输出不同大小的效果
        // 1 循环输出上半部分
        for (int i = 1; i <= starLine; i++) {
            // 1.1 for循环输出空格
            for (int j = 1; j <= starLine - i; j++) {
                System.out.print(" ");
            }
            // 1.2 for循环输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 循环输出伞柄
        // 2.1 制作循环输出的空格
        for (int i = 0; i < starLine-1; i++) {
            str += " ";
        }
        // 2.2 输出伞柄
        for (int j = 0; j < starLine; j++) {
            System.out.println(str + "*");
        }
    }

}
