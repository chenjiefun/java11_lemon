package day06;

import com.alibaba.fastjson.JSONObject;

/**
 * 序列化（将java对象转化为json格式的字符串）
 */
public class JsonDemo2 {
    public static void main(String[] args) {
        Result result = new Result("1","注册成功");
        /**
         * Object是所有类的顶级父类，所以他能够接收所有类型的子类对象
         */
        String jsonString = JSONObject.toJSONString(result,true);
        System.out.println(jsonString);
    }
}
