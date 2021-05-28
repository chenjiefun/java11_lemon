package com.lemon.day07;

/**
 * @Test;用来标记测试方法
 * 测试方法执行顺序，默认是按照方法名的字典顺序来的
 *
 * Alt + Shift + 向上/下箭头： 移动一行
 * Ctrl + Shift + 向上/下箭头：移动整个方法
 *
 * priority;指定优先级，赋值一个整数，数值越大，优先级越低
 *
 */

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDem {
//    @Test
//    public void ad() {
//        Calculat calculat = new Calculat();
//        int au = calculat.add(1,4);
//        Assert.assertEquals(au,5);
//    }
    @Test
    public void b(){
        System.out.println("TestNGDem.b()");
    }
    @Test
    public void a(){
        System.out.println("TestNGDem.a()");
    }
    @Test
    public void c(){
        System.out.println("TestNGDem.c()");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("AnnotationDemo.beforeClass");
    }
}
