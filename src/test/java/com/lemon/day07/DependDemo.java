package com.lemon.day07;

import org.testng.annotations.Test;

public class DependDemo {
    /**
     * 遵从他的语法
     */
    @Test(dependsOnMethods = {"test2"})
    public void test1(){
        System.out.println("DependDemo.test1()");
    }

    @Test
    public void test2(){
        System.out.println("DependDemo.test2()");
    }
}
