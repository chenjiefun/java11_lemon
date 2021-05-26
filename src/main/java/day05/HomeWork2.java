package day05;

public class HomeWork2 {
    public static void main(String[] args) {
          String value = "abcde";
//        StringBuffer stringBuffer = new StringBuffer(value);
//        System.out.println(stringBuffer.reverse().toString());

        /**
         * main方法里面，静态的东西先进内存，还没有对象呢
         */

        HomeWork2 homeWork2 = new HomeWork2();
        System.out.println(homeWork2.reverse(value));

        }

    /**
     * 实现成方法，封装成方法，方便调用
     * @param value
     * @return
     */

    public String reverse(String value) {
        char[] arr = value.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            /**
             * 左右两边拼接之后再赋值给左边的变量,--->拼接字符串
             * 然后根据i取出数组里面的字符把它拼起来
             */
            result += arr[i];
        }
        return result;
    }
}
