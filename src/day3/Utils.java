package day3;

public class Utils {


    /**
     * //判断其是否为空字符串
     * //假设该方法在后期开发中会经常用到，那么每次写起来会增加代码的重复度
     *
     * 通过构造静态方法的方式可以将这一重复度较高的方法抽取成工具类
     *
     * @param str
     * @return
     */
    public static String isNull(String str){
        if (str !=null && !str.equals("")){
            return "该字符串不是空字符串";
        }else {
            return "该字符串是空字符串";
        }
    }
}
