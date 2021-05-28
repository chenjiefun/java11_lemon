package day06;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

/**
 * 想到用java类型去封装这些数据，把数据封装到对象里面去，后面要用这些数据直接操作对象就好了
 * 你要什么对象我们就从对象里面去取
 *
 * 经过不断的练习，能有自己的一套思路
 */

public class ExcleDemo {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        //1.创建Workbook工作簿对象
        /**
         * idea智能提示；alt+shift+空格
         */
        File file = new File("E:\\WorkSpace\\java11\\src\\main\\resources\\student.xlsx");
        InputStream inputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(inputStream);
        //2.创建sheet表单对象,因为sheet在工作簿里面所以用工作簿对象
        Sheet sheet = workbook.getSheetAt(0);
        //3.获取row行对象，因为Row在sheet里面，所以用sheet对象
        /**
         * i和j后面的数字是下标索引，从0开始
         */
        for (int i = 0; i <= 2; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j <=3  ; j++) {
               Cell cell =  row.getCell(j);
               //每一列当做字符串来处理
                cell.setCellType(CellType.STRING);
                //取出列的值
               String value = cell.getStringCellValue();
                System.out.println(value);
            }
        }
        //4.获取cell列对象
    }
}
