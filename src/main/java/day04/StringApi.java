package day04;

/**
 * 这些方法不需要我们自己去实现了，因为别人已经帮我们实现了,学会自己去看方法的描述。
 * 字符串常见的操作
 * trim
 * length
 * equals
 * equalsIgnoreCase
 * indexOf
 * isEmpty
 * lastIndexOf
 * replace
 * split：切割
 * substring：字符串截取
 * valueOf：类型转换
 */
public class StringApi {
    public static void main(String[] args) {
        String aa = " helloWorld ";
        System.out.println(aa.trim());
        System.out.println(aa.length());

        String value1 = "abCD";
        String value2 = "ABcd";
        System.out.println(value1.equals(value2));
        System.out.println(value1.equalsIgnoreCase(value2));

    }
}
