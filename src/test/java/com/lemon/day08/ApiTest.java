package com.lemon.day08;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class ApiTest {
    @Test
    public void testGet() throws IOException {

        //参数
       String params = "username=nickjiang&password=123";
        //接口地址
        String url = "http://localhost:8080/user/register";
        //创建HttpGet对象
        HttpGet httpGet = new HttpGet(url+"?"+params);
        //准备HttpClient客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //发送请求
       CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
       //取出响应状态码
        int code = httpResponse.getStatusLine().getStatusCode();
        System.out.println("状态码："+code);
        //取出响应头
        Header[] headers = httpResponse.getAllHeaders();
        System.out.println("响应头："+Arrays.toString(headers));
        //取出响应报文
        String result = EntityUtils.toString(httpResponse.getEntity());
        System.out.println("响应报文："+result);
        //判断实际值跟期望值
        /**
         * 直接选择封装到map里面去，或者封装成对象
         *
         * 向下转型
         */
       Map<String,String> resultMap  = (Map<String, String>) JSONObject.parse(result);
       String actual = resultMap.get("message");
       String expected = "账号已注册";
       //进行断言
        Assert.assertEquals(actual,expected);
        Assert.assertEquals(200,code);
    }
}
