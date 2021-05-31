package com.lemon.day08;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
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
        String result = HttpUtil.doGet(url,params);
        //判断实际值跟期望值
        /**
         * 直接选择封装到map里面去，或者封装成对象
         *
         * 向下转型
         * JSONObject.parse；我们现在有字符串直接把他解析出来，可以直接解析为map
         *
         * 如果里面有一个变量是整数，可以直接定义为 Object类型
         * toString,  Integer.valueOf()
         *
         * -------->因为我们知道是String类型了，所以我们用String类型来定义；如果有int类型需要用Object类型来定义，然后转化
         *
         * 1、---->转化为一个Object类型的数据，然后我们把它转化为toString,toString就转化为字符串了
         *        Map<String,Object> resultMap  = (Map<String, Object>) JSONObject.parse(result);
         *        String actual = resultMap.get("message").toString;
         *        String expected = "账号已注册";
         *
         * 2、---->转化为一个Object类型的数据，然后我们把它转化为toString,toString就转化为字符串了，然后再使用Integer.valueof()
         *        Map<String,Object> resultMap  = (Map<String, Object>) JSONObject.parse(result);
         *        int actual = Integer.valueof(resultMap.get("status").toString);
         *        String expected = "账号已注册";
         *
         *
         */
       Map<String,String> resultMap  = (Map<String, String>) JSONObject.parse(result);
       String actual = resultMap.get("message");
       String expected = "账号已注册";
       //进行断言
        Assert.assertEquals(actual,expected);
        Assert.assertEquals(200,"code");
    }

    @Test
    public void testPostByForm() throws IOException {
        //测试数据
        String params = "{\"dest\":\"11111111122\",\"modeType\":2}";
        //接口地址
        String url = "http://10.250.61.197:15035/bwlist/addglobalbw";
        String result = HttpUtil.doPostByForm(url,params);
        //判断实际值跟期望值
       Map<String,String> resultMap = (Map<String, String>) JSONObject.parse(result);
       String actual = resultMap.get("message");
       String excepted = "登录成功";
       //进行断言
        Assert.assertEquals(actual,excepted);
    }

}
