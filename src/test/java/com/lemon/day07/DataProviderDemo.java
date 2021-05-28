package com.lemon.day07;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * testng参数化
 * 通过在@DataProvider,(数据提供者)来完成单功能点的批量测试
 */
public class DataProviderDemo {

    @Test(dataProvider = "datas")
    /**
     * 一次把每组数据注入进来
     *通过dataProvider注入三组数据
     *
     * 字符串拼接只不过是输出的格式
     */
    public void login(String username,String password){
        System.out.println("username: "+username+" "+" password: "+password);
    }

    /**
     * 提供三种测试数据
     * @return
     */
    @DataProvider(name="datas")
    public Object[][] datas(){
        Object [][] datas = {
                {"nick","123456"},
                {"peter","123456"},
                {"jeremy","123456"}
        };
        return datas;
    }
}
