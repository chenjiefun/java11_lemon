package com.lemon.day07;

import org.testng.annotations.*;

public class AnnotationDemo {

    /**
     * 在整个套件执行前执行，而且只执行一次
     */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("AnnotationDemo.beforeSuite");
    }
    @Test
    public void test() {
        System.out.println("AnnotationDemo.test");
    }

    @Test
    public void test2() {
        System.out.println("AnnotationDemo.test2");
    }

    /**
     * 在测试集执行前先执行
     */
    @BeforeTest
    public void beforeTest(){
        System.out.println("AnnotationDemo.beforeTest");
    }

    /**
     * 在当前测试类执行前先执行
     */
    @BeforeClass
    public void beforeClass(){
        System.out.println("AnnotationDemo.beforeClass");
    }

    /**
     * 测试方法执行前先执行
     */
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("AnnotationDemo.beforeMethod");
    }



    /**
     * 在整个套件执行后执行，而且只执行一次
     */
    @AfterSuite
    public void afterSuite() {
        System.out.println("AnnotationDemo.afterSuite");
    }

    /**
     * 在测试集执行后执行
     */
    @AfterTest
    public void afterTest(){
        System.out.println("AnnotationDemo.afterTest");
    }

    /**
     * 在当前测试类执行后执行
     */
    @AfterClass
    public void afterClass(){
        System.out.println("AnnotationDemo.afterClass");
    }

    /**
     * 测试方法执行后执行
     */
    @AfterMethod
    public void afterMethod(){
        System.out.println("AnnotationDemo.afterMethod");
    }
}
