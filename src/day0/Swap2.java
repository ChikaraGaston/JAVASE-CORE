package day0;

public class Swap2 {
    public static void main(String[] args) {
        int a=1,b=4;
        System.out.println("a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }
}
