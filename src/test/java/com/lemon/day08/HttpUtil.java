package com.lemon.day08;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;

/**发包的工具类
 * 同一功能性封装成方法
 */
public class HttpUtil {
    /**
     * get请求方法接口的调用
     * @param url 接口地址
     * @param params 测试数据
     * @throws IOException
     */
  /**
    -------->因为我们知道是String类型了，所以我们用String类型来定义；如果有int类型需要用Object类型来定义，然后转化
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

    public static String doGet(String url, String params) throws IOException {
        //创建HttpGet对象
        HttpGet httpGet = new HttpGet(url + "?" + params);
        //准备HttpClient客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //发送请求
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        //取出响应状态码
        int code = httpResponse.getStatusLine().getStatusCode();
        System.out.println("状态码：" + code);
        //取出响应头
        Header[] headers = httpResponse.getAllHeaders();
        System.out.println("响应头：" + Arrays.toString(headers));
        //取出响应报文
        String result = EntityUtils.toString(httpResponse.getEntity());
        System.out.println("响应报文：" + result);
        return result;
    }

    /**
     * post请求方法接口的调用（表单提交）
     * @param url 接口地址
     * @param params 测试数据
     * @throws IOException
     */
    public static String doPostByForm(String url, String params) throws IOException {
        //创建HttpPost对象
        HttpPost httpPost = new HttpPost(url);
        //添加请求头（以表单方式来提交参数）
        httpPost.addHeader(new BasicHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8"));
        //添加参数到请求体
        httpPost.setEntity(new StringEntity(params, "UTF-8"));
        //准备httpclient客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //发送请求
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        //获取响应码
        int code = httpResponse.getStatusLine().getStatusCode();
        System.out.println("状态码为：" + code);
        //获取响应头
        Header[] headers = httpResponse.getAllHeaders();
        System.out.println("响应头为：" + Arrays.toString(headers));
        //获取响应报文
        String result = EntityUtils.toString(httpResponse.getEntity());
        System.out.println("响应报文为：" + result);
        return result;
    }

    /**
     * post请求方法接口的调用（json提交）
     * @param url 接口地址
     * @param params 测试数据
     * @throws IOException
     */
    public static String doPostByJson(String url, String params) throws IOException {
        //创建HttpPost对象
        HttpPost httpPost = new HttpPost(url);
        //添加请求头（以json方式来提交参数）
        httpPost.addHeader(new BasicHeader("Content-Type", "application/json;charset=UTF-8"));
        //添加参数到请求体
        httpPost.setEntity(new StringEntity(params, "UTF-8"));
        //准备httpclient客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //发送请求
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        //获取响应码
        int code = httpResponse.getStatusLine().getStatusCode();
        System.out.println("状态码为：" + code);
        //获取响应头
        Header[] headers = httpResponse.getAllHeaders();
        System.out.println("响应头为：" + Arrays.toString(headers));
        //获取响应报文
        String result = EntityUtils.toString(httpResponse.getEntity());
        System.out.println("响应报文为：" + result);
        return result;
    }
}
