package day06;

public class Test {
    public static void main(String[] args) {
        Result result = new Result("1","注册成功");
        /**
         * 输出这个对象调用toString以后的返回值
         *
         * 重写toString方法，
         * 不重写调的是顶级父类的toString方法，调父类的方法那他输出来肯定是；day06.Result@66d3c617
         */
        System.out.println(result);
        Test tt = new Test();
        tt.test();

    }

    /**
     * 静态的方法可以直接用类名+方法名直接去调
     * 普通的方法不是静态的，就必须老老实实的通过对象去调
     */

    public void test(){
        System.out.println("测试方法调用");
    }
}
