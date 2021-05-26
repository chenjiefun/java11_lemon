package day05;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 无序，去重
 * HashSet去重的原理：添加数据的时候判断要添加的数据的hash值是否跟集合里面的数据一样
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("小新");
        set.add("诺言");
        set.add("诺言");
//      System.out.println(set.size());

//      转为数组
//        Object [] arr = set.toArray();
//        for (String value : set) {
//            System.out.println(value);
//        }
        //set是无序的因此不能通过下标去获取
//        for (int i = 0; i < set.size() ; i++) {
//            System.out.println();
//        }


        //通过迭代器来迭代
        Iterator ite = set.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println(set.size());
        System.out.println("===============");

        //hashCode你就把他当做身份证
        System.out.println("小新".hashCode());
        System.out.println("诺言".hashCode());
    }
}
