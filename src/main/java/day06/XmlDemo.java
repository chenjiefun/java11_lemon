package day06;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class XmlDemo {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        //1.创建解析器
        SAXReader saxReader = new SAXReader();
        //2.获取Document文档对象
        /**
         * 项目放到另外一个项目空间里面去了，绝对路径变了，相对路径不会变啊-->还是相对于这个项目
         */
        File file = new File("E:\\WorkSpace\\java11\\src\\main\\resources\\student.xml");
        InputStream inputStream = new FileInputStream(file);
        Document document = saxReader.read(inputStream);
        //3.获取根节点
        /**
         * 从根节点往下面找，然后一级一级的遍历
         */
        Element root = document.getRootElement();
        String sno = root.attributeValue("sno");
        System.out.println("学号: "+sno);
        //4.通过根节点一级一级遍历，拿到子节点内容
        List<Element> elements =root.elements();
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            String name = element.getName();
            System.out.println("标签名 = "+name);
            String text =  element.getText();
            System.out.println("文本值: "+text);
        }
    }
}
