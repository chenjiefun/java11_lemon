package com.lemon.day07;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Test;用来标记测试方法
 */
public class TestNgDemo {
    @Test
    public void f(){
        Calculator calculator = new Calculator();
        //实际运算结果
        int actual = calculator.add(1,3);
        //通过断言来比较期望结果和实际测试结果
        Assert.assertEquals(actual,4);
    }
}
