package day5.test;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        /**
         * 如果想让集合只能存同样类型的对象，需要使用泛型
         */

        Set<String> set=new HashSet<String>();

        set.add("fgcgcgcg");
        //不能存String类型之外的
       // set.add(123423);
    }
}
