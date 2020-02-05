package day5.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        //key值不能相同，但是value可以
        map.put("b",1);
        map.put("c",23);
        map.put("e",1);
        map.put("d",54545);
        System.out.println(map);

        System.out.println(map.get("b"));//根据key取值

        map.remove("c");
        System.out.println(map);//根据key移除键值对

        System.out.println(map.size());

        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue(1));


        /**
         * 遍历map集合
         */

//        map.keySet();//获取map的key值
//        map.values();//获取map的所有value值

        Set<String> keys=map.keySet();
        for (String k:keys){
            System.out.println("key："+k+",value："+map.get(k));
        }

        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String,Integer> en:entries){
            System.out.println("key："+en.getKey()+",value："+en.getValue());
        }

        Iterator it=map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
