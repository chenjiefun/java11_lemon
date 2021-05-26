package day05;

public class HomeWork3 {
    public static void main(String[] args) {
        String [][] arrs = {
                {"手机号密码均为空","",""},
                {"手机号为空","","123456"},
                {"密码为空","13517315120",""},
                {"错误的账号信息","1351731523","1234567"},
                {"正确的账号信息","13517315120","123456"}
        };
        /**
         * 二维数组里面每一个元素是一维数组
         * print 不换行 ，printIn换行
         */
        for (String[] arr : arrs) {
            for (String value : arr) {
                System.out.print("【"+value+"】");
            }
            System.out.println();
        }
    }
}
