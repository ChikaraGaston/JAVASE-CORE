package day5.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 一般使用map集合，不会使用过于复杂的对象做key
 * TreeMap 存储 Key-Value 对时，需要根据 Key 对 key-value 对进行排序。TreeMap 可以保证所有的 Key-Value 对处于有序状态。
 * TreeMap 的 Key 的排序：
 * 自然排序：TreeMap 的所有的 Key 必须实现 Comparable 接口，
 * 而且所有的 Key 应该是同一个类的对象，否则将会抛出 ClasssCastException
 * 定制排序（了解）：创建 TreeMap 时，传入一个 Comparator 对象，
 * 该对象负责对 TreeMap 中的所有 key 进行排序。此时不需要 Map 的 Key 实现 Comparable 接口
 */
public class TestTreeMap {
    public static void main(String[] args) {


        //TreeMap的自然排序是字典排序
        Map<Integer,String> map=new TreeMap<Integer, String>();
        map.put(4,"a");
        map.put(2,"a");
        map.put(3,"a");
        map.put(1,"a");
//        System.out.println(map);

        Map<String,String> map1=new TreeMap<String, String>();
        map1.put("a","b");
        map1.put("z","b");
        map1.put("d","b");
        map1.put("c","b");
//        System.out.println(map1);


       Set<Integer> keys=map.keySet();
       for (Integer k:keys){
           System.out.println(map.get(k));
       }

       Set<Map.Entry<Integer,String>> entries=map.entrySet();
       for (Map.Entry<Integer,String> en:entries){
           System.out.println("key："+en.getKey()+",value："+en.getValue());
       }

        Iterator it=map.entrySet().iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
