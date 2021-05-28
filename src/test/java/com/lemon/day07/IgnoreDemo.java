package com.lemon.day07;

import org.testng.annotations.Test;

public class IgnoreDemo {

    @Test
    public void test1(){
        System.out.println("DependDemo.test1()");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("DependDemo.test2()");
    }
}
