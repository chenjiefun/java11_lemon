package day05;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * <> 括号里面是容器的类型，里面必须是包装类型
         * 包装类型其实就是基本类型对应的引用类型的另一种叫法
         * boolean->Boolean
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         * float -> Float
         * double -> Double
         * char -> Character
         *
         * Object是顶级父类
         */
        ArrayList<String> list = new ArrayList<String>();
        /**
         * 有序，可重复
         */
        list.add("小新");
        list.add("诺言");
        System.out.println(list.size());
        //查看注释，索引和返回
        String name1 = list.get(1);
        System.out.println(name1);

        //遍历，只要是list就要想到for循环
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
        //iter自动生成增强for循环
//        for (String element : list) {
//            System.out.println(element);
//        }

        //通过迭代器来遍历
       Iterator<String> ite =  list.iterator();
       //通过指针判断list容器里面是否有下一个数据
       while (ite.hasNext()){
           String value = ite.next();
           System.out.println(value);
       }
    }
}
