package day06;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * 反序列化（将json字符串转化为java对象）
 */

public class JsonDemo {
    public static void main(String[] args) {
        String jsonString = "{\"status\":\"1\",\"message\":\"注册成功\"}";
        /**
         * 使用fastJson转化为result对象
         * java文件经过编译以后,本地会得到class文件
         * Result.class 把这个类的字节码给他
         */
        Result result = JSONObject.parseObject(jsonString,Result.class);
        String status = result.getStatus();
        String message = result.getMessage();
        System.out.println(status);
        System.out.println(message);

        /**
         * 将json字符串内容封装到map
         * IDEA使代码强制类型转换快捷键: ALT+ENTER
         */
        Map<String, String> map = (Map<String, String>) JSONObject.parse(jsonString);
        System.out.println(map.get("message"));
        System.out.println(map.get("status"));

    }

    /**
     * 多层；json里面套json
     */
}
