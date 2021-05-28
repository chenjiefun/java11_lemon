package com.lemon.day07;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * testng参数化
 * 通过在testng.xml定义<parameter>元素来定义变量
 *
 * 参数化-->作用解耦-->降低耦合，降低代码的耦合度
 */
public class TestngParameterDemo {
    @Test
    @Parameters(value = {"browserType"})
    public void test(String browserType){
        System.out.println(browserType);
    }
}
