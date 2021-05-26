package day05;

import java.util.Scanner;

/**
 * 1.输入第一个int数
 * 2.输入运算符（+，-，*，/）
 * 3.输入第二个数据
 * 4.输入运算结果
 */
public class HomeWork1 {
    public static void main(String[] args) {
        //输入就必须要用Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数据,然后按回车键: ");
        int a = scanner.nextInt();
        System.out.println("请输入运算符: (+-*/),然后按回车键: ");
        String symbol = scanner.next();
        System.out.println("请输入二个数据,然后按回车键: ");
        int b = scanner.nextInt();
        int result = 0 ;
        if ("+".equals(symbol)){
            result = a + b;
        }else if ("-".equals(symbol)){
            result = a - b;
        }else if ("*".equals(symbol)) {
            result = a * b;
        }else if ("/".equals(symbol)) {
            result = a / b;
        }
        System.out.println(result);
    }
}
