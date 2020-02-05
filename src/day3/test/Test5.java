package day3.test;
import day3.Chinese;
import day3.Utils;

public class Test5 {
    public static void main(String[] args) {
        Chinese.country="中国";
        Chinese c1=new Chinese(12,0,"fg");
        Chinese c2=new Chinese(13,1,"fgfg");
        c1.showInfo();
        System.out.println();
        System.out.println();
        c2.showInfo();

        System.out.println();
        String s="AVBNDDFASD";
        String ss="";
        System.out.println(Utils.isNull(s));
        System.out.println();
        System.out.println(Utils.isNull(ss));

        Chinese c3=new Chinese(12,0,"fg");
        Chinese c4=new Chinese(12,0,"fg");
        Chinese c5=new Chinese(12,0,"fg");
        Chinese c6=new Chinese(12,0,"fg");
        System.out.println();
        Chinese.showCount();
    }
}
