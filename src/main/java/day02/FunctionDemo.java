package day02;

public class FunctionDemo {

    public static void main(String[] args) {
        FunctionDemo demo = new FunctionDemo();
        int result = demo.add(5,6);
        System.out.println(result);
    }

    //修饰符 函数返回值 函数名（参数列表）
    public int add(int a,int b){
        return a+b;

    }
    //
    public void sayHi(){
        System.out.println("大家好");

    }
}
