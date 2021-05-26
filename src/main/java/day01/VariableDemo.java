package day01;

public class VariableDemo {

    /*
    java中有八大节本数据类型，按照类型来分可以分成四类八种。
    1.逻辑类型
    boolean(布尔类型)，取值范围为true/false

    2.整型（整数）
    byte(字节型)，取值范围：-128-127
    short(短整型)，取值范围：-32768-32767
    int(整型)，取值范围；-2147483648-2147483647
    long（长整型）取值范围：-9223372036854775808-9223372036854775807

    3.浮点型（小数）
    float(单精度浮点型)1.4E-45~3.4028235E38
    double(双精度的浮点型)4.9E-324~1.7976931348623157E308

    4.字符型
    char(字符型)：char类型的变量，赋值的时候数据长度只能是一位,并且用“
     */

    public static void main(String[] args) {
        //布尔类型
        boolean aa = true;
        //整型
        byte bb = 1;
        short cc = 1;
        int dd = 1;
        long ee = 2;

        //浮点型
        float ff = (float)3.14;//4字节，大字节类型往小字节类型转换（类型向下强制转换）
        double gg = 3.14;//8字节

        //字符型
        char hh = 'a';
    }
}
