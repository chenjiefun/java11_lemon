package day06;

/**
 * 尽量把数据封装成对象
 */

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        /**
         * 必须要用到io流，把数据读到我们的流里面去
         *
         * 创建子类的对象用父类的类型来接收，这个就是多态
         * 调用这个方法，这个方法需要依赖什么样的参数，我们就给他什么样的参数
         * \ 斜杠表示正则表达式，再加一个\表示文件分隔符
         */

        //准备文件对象
        File file = new File("src\\main\\resources\\jdbc.properties");
        System.out.println(file.exists());
        //将文件内容读到流当中
        InputStream iStream = new FileInputStream(file);
        /**
         * 抛异常，选中按 alter + enter
         *
         * 调用load方法将流对象里面的数据加载到properties对象中
         *
         * throw抛给java虚拟机了，调用别人已经封装好的方法
         */
        properties.load(iStream);
        String username = properties.getProperty("jdbc.username");
        System.out.println(username);
        String url = properties.getProperty("jdbc.url");
        System.out.println(url);
    }
}
