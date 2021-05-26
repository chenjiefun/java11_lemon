package day05;

/**
 * hashMap
 * 1.以key:value的键值对形式保存数据
 * 2.key值不能重复，否则会覆盖，判重原理；根据key值的hash值
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","张三");
        map.put("age","28");
        map.put("gender","男");
        System.out.println(map.size());
        //OBJECT 类型可以往里面存各种各样的数据
        System.out.println(map.get("name"));
//        Set<String> keys = map.keySet();
//        for (String bb : keys) {
//            System.out.println(bb);
//        }
//
//       Collection collection =  map.values();
//        for (Object object : collection) {
//            System.out.println(object);
//        }
        /**
         * 遍历map
         * 通过keySet去遍历里面的每一个key值
         */
//       Set<String> keys =  map.keySet();
//        for (String key : keys) {
//            System.out.println(key+":"+map.get(key));
//        }
        /**
         * Entry:描述的就是键值对
         */

        /**
         * 通过对象去调
         */
//        HashMapDemo demo = new HashMapDemo();
//        demo.bianliMap(map);

        map.put("gender","女");
        System.out.println(map.get("gender"));
    }

    /**
     * 封装成方法
     * @param map
     */
    public void bianliMap(Map<String,String> map){
        Set<Map.Entry<String,String>> entrySet =  map.entrySet();
        for (Map.Entry<String, String> enter : entrySet) {
            System.out.println(enter.getKey()+":"+enter.getValue());

        }
    }
}
